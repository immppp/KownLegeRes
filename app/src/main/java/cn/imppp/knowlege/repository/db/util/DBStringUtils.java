/**
 * 
 */
package cn.imppp.knowlege.repository.db.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @title : DBStringUtils.java
 * @description : 处理数据库中名字和bean类中属性名的对应关系
 * @Company : 杭州达恒科技有限公司
 * @author : tao
 * @date : 2017-3-10 下午2:46:20
 * @version V1.0
 */
public class DBStringUtils {

	private DBStringUtils() {}

	private static final char SEPARATOR = '_';

	/**
	 * convert database column name to java baen attribute name
	 * 
	 * @param columnName
	 * @return
	 */
	public static String conver2Field(String columnName) {
		if (columnName == null) {
			return null;
		}
		
		if(CacheManager.facCacheContainKey(columnName)){
			return CacheManager.getFacCache(columnName);
		}

		StringBuilder sb = new StringBuilder(columnName.length());
		boolean sawSeparator = false;

		for (int i = 0; i < columnName.length(); i++) {
			char c = columnName.charAt(i);
			if (c == SEPARATOR) {
				sawSeparator = true;
			} else {
				if (sawSeparator) {
					sb.append(Character.toUpperCase(c));
					sawSeparator = false;
				} else {
					sb.append(Character.toLowerCase(c));
				}
			}
		}

		String fieldName = sb.toString();

		CacheManager.putFacCache(columnName, fieldName);
		CacheManager.putFacCache(fieldName, columnName);

		return fieldName;

	}

	/**
	 * convert java bean attribute name to database column name
	 * 
	 * @param fieldName
	 * @return
	 */
	public static String convert2ColumnName(String fieldName) {

		if (fieldName == null) {
			return null;
		}
		
		if(CacheManager.facCacheContainKey(fieldName)){
			return CacheManager.getFacCache(fieldName);
		}
		
		StringBuilder sb = new StringBuilder(fieldName.length() + 4);

		for (int i = 0; i < fieldName.length(); i++) {
			char c = fieldName.charAt(i);
			
			if(Character.isUpperCase(c)){
				sb.append(SEPARATOR);
				sb.append(c);
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}

		String columnName = sb.toString();

		CacheManager.putFacCache(fieldName, columnName);
		CacheManager.putFacCache(columnName, fieldName);
		
		return columnName;

	}

	/**
	 * generate select SQL by java bean
	 * 
	 * @param clazz
	 * @param cascadeParent
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static String generateSelectColumns(Class clazz, boolean cascadeParent) {

		StringBuilder sb = new StringBuilder();
		List<Field> fieldList = null;

		if (CacheManager.beanFieldCacheContainKey(clazz)) {
			fieldList = CacheManager.getBeanFieldCache(clazz);
		} else {
			fieldList = new ArrayList<Field>();
			
			Field[] fields = clazz.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				fieldList.add(fields[i]);
			}
			
			if (cascadeParent) {
				clazz = clazz.getSuperclass();
				while(clazz != null && clazz != Object.class){

					fields = clazz.getDeclaredFields();
					for (int i = 0; i < fields.length; i++) {
						fieldList.add(fields[i]);
					}

					clazz = clazz.getSuperclass();
				}
			}
			CacheManager.putBeanFieldCache(clazz, fieldList);
		}

		for (int i = 0; i < fieldList.size(); i++) {
			String fieldName = fieldList.get(i).getName();
			String columnName = convert2ColumnName(fieldName);
			
			if(columnName != null){
				if (sb.length() > 0) {
					sb.append(", ");
				}
				sb.append(columnName);
			}
		}

		return sb.toString();

	}

}

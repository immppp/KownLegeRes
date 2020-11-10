/**
 * 
 */
package cn.imppp.knowlege.repository.db.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @title : CacheManager.java
 * @description : 系统框架缓存工具类
 * @Company : 杭州达恒科技有限公司
 * @author : tao
 * @date : 2017-3-10 下午2:07:16
 * @version V1.0
 */
public class CacheManager {

	private CacheManager() {}

	// java bean field and database column convert value cache every web
	// application
	private static final Map<String, String> facCache = new ConcurrentHashMap<String, String>();

	// java bean field cache for every web application
	@SuppressWarnings("rawtypes")
	private static Map<Class, List<Field>> beanFieldCache = new ConcurrentHashMap<Class, List<Field>>();

	// java bean field cache for every web application
	@SuppressWarnings("rawtypes")
	private static Map<Class, List<Field>> notCascadeBeanCache = new ConcurrentHashMap<Class, List<Field>>();

	// java bean field getter Method cache for every web application
	@SuppressWarnings("rawtypes")
	private static Map<Class, Map<String, Method>> beanReadMethodCache = new ConcurrentHashMap<Class, Map<String, Method>>();

	// java bean field setter Method cache for every web application
	@SuppressWarnings("rawtypes")
	private static Map<Class, Map<String, Method>> beanWriteMethodCache = new ConcurrentHashMap<Class, Map<String, Method>>();

	// for press test
	private static Map<String, byte[]> mainframeCache = new ConcurrentHashMap<String, byte[]>();

	public static boolean mainframeCacheContainKey(String key) {
		return mainframeCache.containsKey(key);
	}

	public static void putMainframeCache(String key, byte[] value) {
		if (key != null && value != null) {
			mainframeCache.put(key, value);
		}
	}

	public static byte[] getMainframeCache(String key) {
		return mainframeCache.get(key);
	}

	public static boolean facCacheContainKey(String key) {
		return facCache.containsKey(key);
	}

	public static void putFacCache(String key, String value) {
		if (key != null && value != null) {
			facCache.put(key, value);
		}
	}

	public static String getFacCache(String key) {
		return facCache.get(key);
	}

	@SuppressWarnings("rawtypes")
	public static boolean beanFieldCacheContainKey(Class clazz) {
		return beanFieldCache.containsKey(clazz);
	}

	@SuppressWarnings("rawtypes")
	public static void putBeanFieldCache(Class clazz, List<Field> fields) {
		if (clazz != null && fields != null) {
			beanFieldCache.put(clazz, fields);
		}
	}

	@SuppressWarnings("rawtypes")
	public static List<Field> getBeanFieldCache(Class clazz) {
		return beanFieldCache.get(clazz);
	}

	@SuppressWarnings("rawtypes")
	public static boolean notCascadeBeanFieldCacheContainKey(Class clazz) {
		return notCascadeBeanCache.containsKey(clazz);
	}

	@SuppressWarnings("rawtypes")
	public static void putNotCascadeBeanFieldCache(Class clazz, List<Field> fields) {
		if (clazz != null && fields != null) {
			notCascadeBeanCache.put(clazz, fields);
		}
	}

	@SuppressWarnings("rawtypes")
	public static List<Field> getNotCascadeBeanFieldCache(Class clazz) {
		return notCascadeBeanCache.get(clazz);
	}

	@SuppressWarnings("rawtypes")
	public static boolean beanReadMethodCacheContainKey(Class clazz) {
		return beanReadMethodCache.containsKey(clazz);
	}

	@SuppressWarnings("rawtypes")
	public static void putBeanReadMethodCache(Class clazz, Map<String, Method> methods) {
		if (clazz != null && methods != null) {
			beanReadMethodCache.put(clazz, methods);
		}
	}

	@SuppressWarnings("rawtypes")
	public static Map<String, Method> getBeanReadMethodCache(Class clazz) {
		return beanReadMethodCache.get(clazz);
	}

	@SuppressWarnings({ "rawtypes" })
	public static boolean beanWriteMethodCacheContainKey(Class clazz) {
		return beanWriteMethodCache.containsKey(clazz);
	}

	@SuppressWarnings("rawtypes")
	public static void putBeanWriteMethodCache(Class clazz, Map<String, Method> methods) {
		if (clazz != null && methods != null) {
			beanWriteMethodCache.put(clazz, methods);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static Map<String, Method> getBeanWriteMethodCache(Class clazz){
		return beanWriteMethodCache.get(clazz);
	}

}

package cn.imppp.knowlege.listener;

import android.content.DialogInterface;

public interface OnDialogClickListener {

    void onPositiveClick(DialogInterface dialog, String text);

    void onNegativeClick(DialogInterface dialog);
}

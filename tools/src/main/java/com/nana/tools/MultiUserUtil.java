package com.nana.tools;

import android.app.AlertDialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MultiUserUtil {

    //解决多用户下，dialog不能显示的问题
    public static void showDialog(Context context, View view) {
        AlertDialog alertDialogAddHomeLink = new AlertDialog.Builder(context)
                .setView(view).create();
        Window window = alertDialogAddHomeLink.getWindow();
        WindowManager.LayoutParams p = window.getAttributes();
        p.privateFlags = WindowManager.LayoutParams.PRIVATE_FLAG_SHOW_FOR_ALL_USERS;
        window.clearFlags(WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
        window.setAttributes(p);
        alertDialogAddHomeLink.show();

    }

    //解决多用户下，Toast不能显示的问题
    private void showToast(Context context,String msg) {
        Toast toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        toast.getWindowParams().privateFlags = WindowManager.LayoutParams.PRIVATE_FLAG_SHOW_FOR_ALL_USERS;
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}

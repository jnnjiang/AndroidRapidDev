package com.nana.tools;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class ImeUtil {
    private void showKeyboard(Context context,View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.showSoftInput(view, 0);
    }
}

package com.jtt.library;

import android.widget.TextView;

/**
 * Created by Jtt on 2017/8/17.
 * StringUtil: TODO
 */

public class StringUtil {

    public StringUtil() {
        throw new UnsupportedOperationException("StringUtil cannot be instantiated");
    }

    public static boolean isEmpty(String text) {
        return null == text || text.length() == 0;
    }

    public static boolean isNotEmpty(String text) {
        return null != text || text.length() > 0;
    }

    public static boolean isNullEmpty(String text) {
        return null == text || text.length() == 0 || "null".equals(text.toLowerCase()) ||
                "(null)".equals(text.toLowerCase());
    }

    public static String getTextValue(TextView textView) {
        return null == textView ? "" : textView.getText().toString();
    }


}

package com.jtt.library;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by Jtt on 2017/8/17.
 * ResourcesUtil: TODO
 */

public class ResourcesUtil {

    private ResourcesUtil() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 获取子资源文件
     * @param context
     * @return
     */
    public static Resources getResources(Context context) {
        return context.getResources();
    }

    /**
     * 获取dimen
     * @param context
     * @param resId
     * @return
     */
    public static float getDimens(Context context, int resId) {
        return getResources(context).getDimension(resId);
    }

    /**
     * 获取string
     * @param context
     * @param resId
     * @return
     */
    public static String getString(Context context, int resId) {
        return getString(context, resId);
    }
}

package com.gary.weatherdemo.utils;

import org.xutils.x;

/**
 * Import from xUtils3: https://github.com/wyouflf/xUtils3
 */
public final class XutilsDensityUtil {

    private static float density = -1F;
    private static int widthPixels = -1;
    private static int heightPixels = -1;

    private XutilsDensityUtil() {
    }

    public static float getDensity() {
        if (density <= 0F) {
            density = x.app().getResources().getDisplayMetrics().density;
        }
        return density;
    }

    public static int dip2px(float dpValue) {
        return (int) (dpValue * getDensity() + 0.5F);
    }

    public static int px2dip(float pxValue) {
        return (int) (pxValue / getDensity() + 0.5F);
    }

    public static int getScreenWidth() {
        if (widthPixels <= 0) {
            widthPixels = x.app().getResources().getDisplayMetrics().widthPixels;
        }
        return widthPixels;
    }


    public static int getScreenHeight() {
        if (heightPixels <= 0) {
            heightPixels = x.app().getResources().getDisplayMetrics().heightPixels;
        }
        return heightPixels;
    }
}

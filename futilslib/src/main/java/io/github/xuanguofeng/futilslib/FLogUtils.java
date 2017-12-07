package io.github.xuanguofeng.futilslib;

import android.util.Log;

import io.github.xuanguofeng.futilslib.log.LogLevel;

public class FLogUtils {

    private static String mTag = FUtilsConfig.LOG_COMMON_TAG;
    private static LogLevel mDebuggable = FUtilsConfig.LOG_LEVEL;

    public static void v(String msg) {
        if (mDebuggable == LogLevel.LEVEL_ALL || mDebuggable == LogLevel.LEVEL_VERBOSE) {
            printLog(mTag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (mDebuggable == LogLevel.LEVEL_ALL || mDebuggable == LogLevel.LEVEL_VERBOSE) {
            printLog(tag, msg);
        }
    }

    public static void d(String msg) {
        if (mDebuggable == LogLevel.LEVEL_ALL || mDebuggable == LogLevel.LEVEL_DEBUG) {
            printLog(mTag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (mDebuggable == LogLevel.LEVEL_ALL || mDebuggable == LogLevel.LEVEL_DEBUG) {
            printLog(tag, msg);
        }
    }

    public static void i(String msg) {
        if (mDebuggable == LogLevel.LEVEL_ALL || mDebuggable == LogLevel.LEVEL_INFO) {
            printLog(mTag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (mDebuggable == LogLevel.LEVEL_ALL || mDebuggable == LogLevel.LEVEL_INFO) {
            printLog(tag, msg);
        }
    }

    public static void w(String msg) {
        if (mDebuggable == LogLevel.LEVEL_ALL || mDebuggable == LogLevel.LEVEL_WARN) {
            printLog(mTag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (mDebuggable == LogLevel.LEVEL_ALL || mDebuggable == LogLevel.LEVEL_WARN) {
            printLog(tag, msg);
        }
    }

    public static void e(String msg) {
        if (mDebuggable == LogLevel.LEVEL_ALL || mDebuggable == LogLevel.LEVEL_ERROR) {
            printLog(mTag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (mDebuggable == LogLevel.LEVEL_ALL || mDebuggable == LogLevel.LEVEL_ERROR) {
            printLog(tag, msg);
        }
    }

    private static void printLog(String tag, String msg) {
        Log.i(tag, "══════════════════════════════════════════════════════════════════════════════════");
        Log.i(tag, " \n");
        Log.i(tag,  msg);
        Log.i(tag, " \n");
        Log.i(tag, "══════════════════════════════════════════════════════════════════════════════════");
    }
}

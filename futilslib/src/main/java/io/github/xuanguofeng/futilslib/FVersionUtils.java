package io.github.xuanguofeng.futilslib;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * description:
 * created time: 2017/11/8 16:00
 *
 * @author xuanguofeng
 */

public class FVersionUtils {

    /**
     * Get the Android version number
     *
     * @return Android version
     */
    public static String getAndroidVersion() {
        String version = null;
        try {
            version = android.os.Build.VERSION.RELEASE;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return version;
    }

    /**
     * Get the APP version number
     *
     * @param mContext context environment
     * @return APP version
     */
    public static String getAPPVersion(Context mContext) {
        String version = null;
        PackageManager packageManager = mContext.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(mContext.getPackageName(), 0);
            version = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }

}

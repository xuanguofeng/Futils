package io.github.xuanguofeng.futilslib;

import io.github.xuanguofeng.futilslib.time.TimeMonitor;
import io.github.xuanguofeng.futilslib.time.TimeMonitorManager;

/**
 * description: Tools for time conversion and method execution time
 * created time: 2017/11/30 17:13
 * @author xuanguofeng
 */

public class FTimeUtils {

    public static void startTimeMonitor(int id) {
        TimeMonitor timeMonitor = TimeMonitorManager.getInstance().getTimeMonitor();
        timeMonitor.start(id);
    }

    public static void endTimeMonitor(int id) {
        TimeMonitor timeMonitor = TimeMonitorManager.getInstance().getTimeMonitor();
        timeMonitor.end(id);
    }
}

package io.github.xuanguofeng.futilslib.time;

public class TimeMonitorManager {
    private static TimeMonitor mTimeMonitor = null;

    public static TimeMonitorManager getInstance() {
        return Instance.timeMonitorManager;
    }

    private TimeMonitorManager() {
        mTimeMonitor = new TimeMonitor();
    }

    private static class Instance {
        private static final TimeMonitorManager timeMonitorManager = new TimeMonitorManager();
    }

    public TimeMonitor getTimeMonitor() {
        if (mTimeMonitor != null) {
            return mTimeMonitor;
        } else {
            return new TimeMonitor();
        }
    }
}

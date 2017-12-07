package io.github.xuanguofeng.futilslib.time;

import java.util.LinkedHashMap;
import io.github.xuanguofeng.futilslib.FLogUtils;
import io.github.xuanguofeng.futilslib.FUtilsConfig;

public class TimeMonitor {

    private LinkedHashMap<Integer, Long> mTimeTag = new LinkedHashMap<>();
    private long mStartTime = 0;

    TimeMonitor() {}

    public void start(int id) {
        if (mTimeTag.size() > 0) {
            mTimeTag.clear();
        }
        mStartTime = System.currentTimeMillis();
    }

    public void end(int id) {
        if (mTimeTag.get(id) != null) {
            mTimeTag.remove(id);
        }

        long time = System.currentTimeMillis() - mStartTime;

        if (FUtilsConfig.IS_WRITE_LOCAL_TIME_MONITOR_LOG) {
            // TODO: 2017/12/7 写入本地文件
        } else {
            FLogUtils.d(FUtilsConfig.LOG_TIME_MONITOR_TAG, "id：" + id + "，time："+time+"ms");
        }
        mTimeTag.put(id,time);
    }
}

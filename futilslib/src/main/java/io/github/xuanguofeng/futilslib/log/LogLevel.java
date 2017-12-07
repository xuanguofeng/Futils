package io.github.xuanguofeng.futilslib.log;

/**
 * description:
 * created time: 2017/11/30 17:53
 *
 * @author xuanguofeng
 */

public enum LogLevel {
    LEVEL_NONE(0), LEVEL_VERBOSE(1), LEVEL_DEBUG(2), LEVEL_INFO(3),
    LEVEL_WARN(4), LEVEL_ERROR(5), LEVEL_ALL(6);

    private int level;

    LogLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

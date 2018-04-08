package cn.caizhaoke.common.framework;

import java.util.Date;

public class SystemTime {

    private static final TimeSource defaultSrc = new TimeSource() {

        @Override
        public long millis() {
            return System.currentTimeMillis();
        }
    };

    private static TimeSource source = null;

    public static long asMills() {
        return getTimeSource().millis();
    }

    public static Date asDate() {
        return new Date(asMills());
    }

    public static void reset() {
        setTimeSource(null);
    }

    public static TimeSource getTimeSource() {
        if (source != null) {
            return source;
        } else {
            return defaultSrc;
        }
    }

    public static void setTimeSource(TimeSource source) {
        SystemTime.source = source;
    }

    public interface TimeSource {
        long millis();
    }

}

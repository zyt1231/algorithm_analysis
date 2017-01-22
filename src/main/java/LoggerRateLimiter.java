import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ting on 1/21/17.
 * Design a logger system that receive stream of messages along with its timestamps,
 * each message should be printed if and only if it is not printed in the last 10 seconds.
 * Given a message and a timestamp (in seconds granularity),
 * return true if the message should be printed in the given timestamp, otherwise returns false.
 * It is possible that several messages arrive roughly at the same time.
 */
public class LoggerRateLimiter {
    private Map<String, Integer> map = new HashMap<String,Integer>();
    private int limiter = 10;
    public boolean shouldPrintMessage(int timestamp, String msg) {
        if(map.containsKey(msg)){
            if(timestamp - map.get(msg) >= limiter){
                map.put(msg, timestamp);
                return true;
            }
            return false;
        }
        map.put(msg, timestamp);
        return true;
    }

    public static void main(String[] args) {
        LoggerRateLimiter logger = new LoggerRateLimiter();
        System.out.println(logger.shouldPrintMessage(1, "foo"));
        System.out.println(logger.shouldPrintMessage(3, "bar"));
        System.out.println(logger.shouldPrintMessage(3, "foo"));
        System.out.println(logger.shouldPrintMessage(8, "bar"));
        System.out.println(logger.shouldPrintMessage(10, "foo"));
        System.out.println(logger.shouldPrintMessage(11, "foo"));
        System.out.println(logger.shouldPrintMessage(20, "bar"));
    }

}

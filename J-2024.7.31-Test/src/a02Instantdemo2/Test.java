package a02Instantdemo2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
    public static void main(String[] args) {
//        static Instant now()                    获取当前时间的Instant对象（标准时间）
//        static Instant ofXxxx(long epochMilli)  根据（秒/毫秒/纳秒）获取Instant对象
//        ZonedDateTime atZone(ZoneId zone)       指定时区
//        boolean isXxx(Instant otherInstant)     判断系列的方法
//        Instant minusXxx(long millisToSubtract) 减少时间系列的方法
//        Instant plusXxx(long millisToSubtract)  增加时间系列的方法

        //1.获取当前时间的Instant对象（标准时间）
        Instant now = Instant.now();
        System.out.println(now);//2024-07-31T01:01:38.594163800Z

        //2static Instant ofXxxx(long epochMilli)  根据（秒/毫秒/纳秒）获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);//1970-01-01T00:00:00Z

        Instant instant2 = Instant.ofEpochSecond(1L);//过了一秒后的时间
        System.out.println(instant2);//1970-01-01T00:00:00Z

        Instant instant3 = Instant.ofEpochSecond(1l, 1000000000l);
        //过了一秒后再过1000000000毫秒的时间是:
        System.out.println(instant3);//1970-01-01T00:00:02Z

        //3. ZonedDateTime atZone(ZoneId zone)为非静态方法,使用的时候要调用ZoneId对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        //非静态方法,用对象名调用方法,方法内需要放指定的时区,用of方法来指定时区,of方法为静态方法需要通过类名来调用
        System.out.println(time);//2024-07-31T09:16:30.790517400+08:00[Asia/Shanghai]

        //4.boolean isXxx(Instant otherInstant)判断系列的方法
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);
        //isBefore:判断调用者代表的时间是否在参数表示的时间前面
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);//true
        //isAfter:判断调用者代表的时间是否在参数表示的时间后面
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);//false

        //5.Instant minusXxx(long millisToSubtract)减少时间系列的方法
        //非静态方法,用对象名调用
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);//1970-01-01T00:00:03Z

        Instant instant7 = instant6.minusSeconds(1L);//减少1秒
//        Instant instant8 = instant6.minusMillis(1L);//减少1微秒
//        Instant instant9 = instant6.minusNanos(1L);//减少1纳秒
        System.out.println(instant7);//1970-01-01T00:00:02Z

        //6.Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        Instant instant10 = instant6.plusMillis(1L);//增加1秒-与减少同样的也有增加微秒纳秒的方法
        System.out.println(instant10);//1970-01-01T00:00:03.001Z
    }
}

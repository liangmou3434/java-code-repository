package a03ZoneDateTimedemo3;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {
    public static void main(String[] args) {
//
//       static Zstatic ZonedDateTime now()         获取当前时间的ZonedDateTime对象
//       static ZonedDateTime ofXxxx()              获取指定时间的ZonedDateTime对象
//        ZonedDateTime withXxx（时间)               修改时间系列的方法
//        ZonedDateTime minusXxx（时间）             减少时间系列的方法
//        ZonedDateTime plusXxx（时间）              增加时间系列的方法

        //1.获取当前的时间对象(带时区)
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println(zdt1);//2024-07-31T09:38:36.806829500+08:00[Asia/Shanghai]

//        //2.获得指定时间的对象 年月日时分秒毫秒方式指定
        ZonedDateTime time1 = ZonedDateTime.of(2024, 7, 30, 9,
                43, 0,0,ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);//2024-07-30T09:43+08:00[Asia/Shanghai]

        //通过Instant + 时区的方式指定获取时间对象
        Instant instant1 = Instant.ofEpochMilli(0L);//根据（秒/毫秒/纳秒）获取Instant对象
        ZoneId zi1 = ZoneId.of("Asia/Shanghai");//获取指定时区
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant1, zi1);
        System.out.println(time2);

        //3.ZonedDateTime withXxx（时间)修改时间系列的方法
        //非静态方法-通过对象名调用
        ZonedDateTime zdt2 = ZonedDateTime.now();//创建对象
        ZonedDateTime zdt3 = zdt2.withYear(2000);//把2024年修改成2000年
        System.out.println(zdt3);//2000-07-31T10:14:58.906669300+08:00[Asia/Shanghai]

        //4.ZonedDateTime minusXxx（时间)-减少时间系列的方法
        //非静态方法,通过对象名调用
        ZonedDateTime zdt4 = ZonedDateTime.now();//创建对象
        ZonedDateTime zdt5 = zdt4.minusYears(1L);//2024年减少一年到2023年
        System.out.println(zdt5);//2023-07-31T10:18:26.682334500+08:00[Asia/Shanghai]

        //5.ZonedDateTime plusXxx(时间)增加时间系列的方法
        //非静态方法,需要创建对象,通过对象名调用
        ZonedDateTime zdt6 = ZonedDateTime.now();//创建对象
        ZonedDateTime zdt7 = zdt6.plusYears(1L);//增加一年的时间,从2024增加到2025
        System.out.println(zdt7);//2025-07-31T10:21:00.140869500+08:00[Asia/Shanghai]

        //Jdk8新增的时间对象都是不可变的,如果修改了,调用者不会发生改变,只会产生一个新的时间
    }
}

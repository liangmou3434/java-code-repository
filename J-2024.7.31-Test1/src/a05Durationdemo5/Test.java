package a05Durationdemo5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        //获取当地的时间
        LocalDateTime ld1 = LocalDateTime.now();
        //指定时间
        LocalDateTime ld2 = LocalDateTime.of(2004, 8, 30, 2, 5, 2);

        Duration ret = Duration.between(ld2, ld1);
        System.out.println("相差的时间间隔对象:" + ret);//相差的时间间隔对象:PT174617H42M40.3030859S
        //相差的时间间隔对象:PT 174617H 42M 40.3030859S
        //间隔174617小时42分40.3030859秒

        System.out.println(ret.toDays());//两个时间差的天数 7275
        System.out.println(ret.toHours());//两个时间差的小时数 174617
        System.out.println(ret.toSeconds());//两个时间差的分钟数 628624092
        System.out.println(ret.toMillis());//两个时间差的毫秒数 628624092051

    }
}

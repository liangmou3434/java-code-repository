package a03LocalDateTimedemo3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        //获取当前日历的对象(包括 年月日时分秒)
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);//2024-07-31T18:52:41.249746100

        //分别获取年 月 日 时 分 秒
        System.out.println(ldt1.getYear());//年 2024
        System.out.println(ldt1.getMonthValue());//月 7
        System.out.println(ldt1.getDayOfMonth());//日 31
        System.out.println(ldt1.getHour());//时 18
        System.out.println(ldt1.getMinute());//分 55
        System.out.println(ldt1.getSecond());//秒 3

        //当前表示时间是当年的第几天
        int dayOfYear = ldt1.getDayOfYear();
        System.out.println("dayOfYear: "+ dayOfYear);//dayOfYear: 213
        //星期
        System.out.println(ldt1.getDayOfWeek());//WEDNESDAY
        //月份
        System.out.println(ldt1.getDayOfMonth());//日:31
        System.out.println(ldt1.getMonth().getValue());//月:7

        //转变成LocalDate类
        LocalDate ldt2 = ldt1.toLocalDate();//删除时分秒
        System.out.println(ldt2);//2024-07-31


    }
}

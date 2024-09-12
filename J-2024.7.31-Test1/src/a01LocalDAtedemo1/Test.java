package a01LocalDAtedemo1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Test {
    public static void main(String[] args) {
        //1.获取当前时间的日历对象(包括年月日)
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);//2024-07-31

        //2.获取指定的时间日历对象
        LocalDate ld2 = LocalDate.of(2023, 7, 31);
        System.out.println(ld2);//2023-07-31

        //3.get系列方法获取日历中的每一个属性值
        //获取年
        int year = ld2.getYear();
        System.out.println("year:" + year);//year:2023

        //获取月份 方式一:
        Month month = ld2.getMonth();
        System.out.println("month:" + month);//month:JULY
        System.out.println(month.getValue());//7
        //方式二:
        int monthValue = ld2.getMonthValue();
        System.out.println(monthValue);//7

        //获取日
        int dayOfMonth = ld2.getDayOfMonth();
        System.out.println("dayOfMonth:" + dayOfMonth);//dayOfMonth:31

        //获取一年中的第几天-表明当前日期是一年中的第几天
        int dayOfYear = ld2.getDayOfYear();
        System.out.println("dayOfYear: " + dayOfYear);//dayOfYear: 212

        //获取星期-当前日期是星期几
        DayOfWeek dayOfWeek = ld2.getDayOfWeek();
        System.out.println("dayOfWeek:" + dayOfWeek);//dayOfWeek:MONDAY
        System.out.println(dayOfWeek.getValue());//1

        //is开头的方法表示判断
        //判断ld1的时间是否在ld2的前面
        System.out.println(ld1.isBefore(ld2));//false
        //判断ld1的时间是否在ld2的后面
        System.out.println(ld1.isAfter(ld2));//true

        //with开头的方法表示修改,只能修改年月日
        LocalDate ld3 = ld2.withYear(2000);//将ld2对象的年改成2000
        System.out.println(ld3);//2000-07-31

        //minus开头的方法表示减少，只能减少年月日
        LocalDate ld4 = ld3.minusYears(1);//2000年减少1年 1999
        System.out.println(ld4);//1999-07-31

        //plus开头的方法表示增加，只能增加年月日
        LocalDate ld5 = ld4.plusYears(1);//1999年增加1年 2000
        System.out.println(ld5);//2000-07-31

    }
}

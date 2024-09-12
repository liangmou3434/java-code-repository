package a02LocalTime02demo2;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        //1.获取本地时间的日历对象(包括 时分秒)
        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);//17:29:28.775044400

        //单独获取本地时间的 时分秒
        int hour = lt1.getHour();//时
        System.out.println("hour:" + hour);//hour:17

        int minute = lt1.getMinute();//分
        System.out.println(minute);//43

        int second = lt1.getSecond();//秒
        System.out.println(second);//5

        //获取指定的时间
        System.out.println(LocalTime.of(17,49));//时分 17:49
        System.out.println(LocalTime.of(17,49,05));//时分秒 17:49:05
        System.out.println(LocalTime.of(17,49,05,150));
        //时分秒纳秒 17:49:05.000000150

        //is系列的方法
        LocalTime lt2 = LocalTime.now();
        LocalTime lt3 = LocalTime.of(18, 0);
        //判断lt2的时间是否在lt3前面
        System.out.println(lt2.isBefore(lt3));//false
        //判断lt2的时间是否在lt3后面
        System.out.println(lt2.isAfter(lt3));//true

        //with系列的方法-修改时间
        LocalTime lt4 = lt3.withHour(17);//把18修改成17
        System.out.println(lt4);//17:00

        //minus系列的方法-对时间的减少
        LocalTime lt5 = lt4.minusHours(1);//把17减成16
        System.out.println(lt5);//16:00

        //plus系列的方法-对时间的增加
        LocalTime lt6 = lt5.plusHours(1);//把16+1变成17
        System.out.println(lt6);//17:00
    }
}

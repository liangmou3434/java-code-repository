package a01ZoneIddemo1;

import java.time.ZoneId;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
//        static Set<String> getAvailableZoneIds()  获取Java中支持的所有时区
//        static ZoneId systemDefault()             获取系统默认时区
//        static ZoneId of(String zoneId)           获取一个指定时区

        //1.获取所有时区的名称
        Set<String> zoneid = ZoneId.getAvailableZoneIds();
//        System.out.println(zoneid.size());//602 获取集合的长度
//        System.out.println(zoneid);//Asia/shanghai

        //2.获取系统的默认时区
        ZoneId zi = ZoneId.systemDefault();
        System.out.println(zi);

        //3.获取指定时区
        ZoneId zi1 = ZoneId.of("Asia/Shanghai");
        System.out.println(zi1);
    }
}

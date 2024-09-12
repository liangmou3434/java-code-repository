package a04DateTimeFormatterdemo4;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
//        static DateTimeFormatterofPattern（格式） 获取格式对象
//        String format（时间对象） 按照指定方式格式化

        //获取时间对象
        ZonedDateTime time = Instant.now().atZone((ZoneId.of("Asia/Shanghai")));
        //Instant.now()-获取Instant对象 atZone(Zone zone) ZoneId-获得指定的时区

        //获取格式化的对象
        DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//格式化的样式
//        System.out.println(dtfm.format(time));//2024-07-31 10:33:27
        String ret = dtfm.format(time);
        System.out.println(ret);
    }
}

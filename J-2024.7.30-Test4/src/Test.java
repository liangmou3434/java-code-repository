import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Test {
    public static void main(String[] args) throws ParseException {
        //构造方法
        //public SimpleDateFormat() 默认格式
        //public SimpleDateFormat(String pattern) 指定格式

        //成员方法
        //public final String format(Date date) 格式化（日期对象->字符串)
        //public Date parse(String source)解析（字符串->日期对象）

        //1.利用空参构造创建SimpleDateFormat对象,默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date();
        String str1 = sdf1.format(d1);//格式化时间
        System.out.println(str1);//2024/7/30 下午2:48-默认格式

        //2.利用有参构造创建SimpleDateFormat对象,指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d2 = new Date();
        String str2 = sdf2.format(d2);//格式化时间
        System.out.println(str2);//2024年07月30日 14:51:06

        //3.定义一个字符串表示时间
        String str3 = "2023-11-11 11:11:11";
        //利用有参构造创建SimpleDateFormat对象,默认格式
        //创建的格式要跟字符串格式完全一致
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d3 = sdf3.parse(str3);//将字符串解析成时间对象
        System.out.println(d3);//Sat Nov 11 11:11:11 CST 2023

    }
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        //练习:
//        假设，你初恋的出生年月日为：2000-11-11
//        请用字符串表示这个数据，并将其转换为：2000年11月11日

        String str = "2000年11月11日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月mm日");
        Date d = sdf.parse(str);
        System.out.println(d);//Sat Jan 01 00:11:00 CST 2000
        //再把时间对象格式化
        String result = sdf.format(d);//通过对象调用方法,再把时间放进方法里,将时间格式化
        System.out.println(result);
    }
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        //秒杀开始时间：2023年11月11日0:0:0
        //秒杀结束时间：2023年11月11日0:10:0
        //判断两个同学是否在秒杀活动的时间内
        String str1 = "2023年11月11日0:01:00";//小贾的下单付款时间
        String str2 = "2023年11月11日0:11:0";//小皮的下单付款时间
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年mm月dd日H:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年mm月dd日H:mm:s");
        //将字符串转变成时间对象
        Date d1 = sdf1.parse(str1);
        Date d2 = sdf1.parse(str2);
        long time1 = d1.getTime();
        long time2 = d1.getTime();//将时间对象转变成毫秒值
        boolean ret1 = Check(time1);
        boolean ret2 = Check(time2);
       if(ret1 == true){
           System.out.println("小贾的下单付款时间在秒杀活动时间内");
       }else{
           System.out.println("小贾的下单付款时间不在秒杀活动时间内");
       }
        if(ret2 == true){
            System.out.println("小皮的下单付款时间在秒杀活动时间内");
        }else{
            System.out.println("小皮的下单付款时间不在秒杀活动时间内");
        }
    }
    public static boolean Check(long time) throws ParseException {
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年mm月dd日H:m:s");
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy年mm月dd日H:mm:s");
        String str3 = "2023年11月11日0:0:0";
        String str4 = "2023年11月11日0:10:0";
        //将字符串转变成时间对象再转变成毫秒值
        long time3 = sdf3.parse(str3).getTime();//秒杀开始时间
        long time4 = sdf4.parse(str4).getTime();//秒杀结束时间
        if(time >= time3 && time <= time4){
            return true;
        }else{
            return false;
        }
    }
}

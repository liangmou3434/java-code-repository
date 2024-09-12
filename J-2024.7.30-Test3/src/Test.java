import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //public Date() 创建Date对象，表示当前时间
        //public Date(long date) 创建Date对象，表示指定时间
//        public void setTime(long time) 设置/修改毫秒值
//        public long getTime() 获取时间对象的毫秒值

        //1.创建一个对象表示时间
        Date d1 = new Date();
        System.out.println(d1);//Tue Jul 30 14:14:00 CST 2024

        //2.创建对象表示一个指定的时间
        Date d2 = new Date(0l);
        System.out.println(d2);//Thu Jan 01 08:00:00 CST 1970

        //3.setTime 修改时间
        //1000毫秒=1秒
        d2.setTime(1000L);
        System.out.println(d2);//Thu Jan 01 08:00:01 CST 1970

        //4.getTime 获取当前时间的毫秒值
        long time = d2.getTime();
        System.out.println(time);//1000

    }
}

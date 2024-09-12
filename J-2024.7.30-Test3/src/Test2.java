import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
//        需求1：打印时间原点开始一年之后的时间
//        需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后

        //1.需求1:
        //1.创建一个对象,表示时间原点
        Date d1 = new Date(0L);
        //获取时间的毫秒值
        long time = d1.getTime();
        //在毫秒值的基础上加上一年的毫秒
        time = time + 1000l * 60 * 60 * 24 * 365;
        //把计算完后的毫秒值再赋值给d1
        d1.setTime(time);
        System.out.println(d1);//Fri Jan 01 08:00:00 CST 1971

        //2.需求2
        Date d2 = new Date();
        Date d3 = new Date();
         long time2 = d2.getTime();
         long time3 = d2.getTime();
         if(time2 > time){
             System.out.println("第一个时间在前,第二个时间在后");
         }else if(time2 < time3){
             System.out.println("第一个时间在后,第二个时间前");
         }else{
             System.out.println("两个时间一样");
         }

    }
}

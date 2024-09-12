import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
//        Calendar类
        //public static Calendar getInstance() 获取当前时间的日历对象
        //public final setTime(Date date) 给日历设置日期对象

        //1.获取日历对象
        //Calendar类是一个抽象类,不能直接创建对象,通过一个静态方法来获取到子类的对象
        //底层原理:会根据体统的不同失去来获取不同的日历对象
        //把时间中的纪元,年,月,日,时,分秒,星期等都放到一个数组里

        //月的范围为0~11 如果获取出来的是0 实际上是1月
        //星期 1-星期天 2-星期一 3-星期二 4-星期三 5-星期四 6-星期五 7-星期六
        //0索引:纪年 1-年 2-月 3-一年中的第几周 4-一个月中的第几周 5-一个月中的第几天
        Calendar c = Calendar.getInstance();
//        System.out.println(c);

//        2.public final setTime(Date date) 给日历设置日期对象
            Date d = new Date(0L);
            c.setTime(d);
//        System.out.println(c);//把时间原点设置成日期对象


//        public int get(int field)                 取日期中的某个字段信息
//        public void set（int field,int value)     修改日历的某个字段信息
//        public void add（int field,int amount)    为某个字段增加/减少指定的值

        //java在calendar类中，把索引对应的数字都定义成常量
        //0索引:纪年 1-年 2-月 3-一年中的第几周 4-一个月中的第几周 5-一个月中的第几天

        c.set(Calendar.YEAR,2000);//把年份从1970改成2000
        c.set(Calendar.MONTH,11);//修改的月份可以大于12个月,编译器会自动增加年份

        //再调用方法的基础上增加一个月 正数+ 负数-
        c.add(Calendar.MONTH,1);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;//月份需要+1
        int date = c.get(Calendar.DAY_OF_MONTH);
//        int week = c.get(Calendar.DAY_OF_WEEK);
//        System.out.println(year + "," + month + "," + date + "," + Week(c.get(Calendar.DAY_OF_WEEK)));

        //public void set（int field,int value)修改日历的某个字段信息
        System.out.println(year + "," + month + "," + date + "," + Week(c.get(Calendar.DAY_OF_WEEK)));
    }
    public static String Week(int index){
      String[] arr = {"","星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
        //星期 下标1-星期天 2-星期一 3-星期二 4-星期三 5-星期四 6-星期五 7-星期六
        return arr[index];
    }
}

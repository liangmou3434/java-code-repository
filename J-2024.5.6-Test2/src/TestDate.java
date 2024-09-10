//定义一个与日期类
public class TestDate {
     public int year;
     public int month;
     public int day;
     public void Setdate(int year,int month,int day){
        this. year = year;//this引用的是调用成员方法的对象
        this.month = month;
        this.day = day;
     }
     public void Printdate(){
         System.out.println(year+"-"+month+"-"+day);
     }

    public static void main(String[] args) {//方法二，调用Setdate进行赋值
     TestDate testdate = new TestDate();
     testdate.Setdate(2024,5,6);
     testdate.Printdate();
     }
//    public static void main(String[] args) {//方法一直接赋值
//        TestDate testdate = new TestDate();//将类实例化
//        testdate.year = 2024;
//        testdate.month = 5;
//        testdate.day = 6;
//        testdate.Printdate();
//    }
}

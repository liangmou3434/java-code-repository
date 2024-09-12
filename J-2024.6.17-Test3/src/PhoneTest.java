import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {//定义一个集合,存入三个手机对象 定义一个方法,返回价格低于三千的手机的信息
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("华为",2999);
        Phone p2 = new Phone("苹果",5999);
        Phone p3 = new Phone("三星",1888);//创建三个手机对象
        list.add(p1);
        list.add(p2);
        list.add(p3);//把手机对象存进集合
        ArrayList<Phone> result = LowPhoneinfo(list);
        //再遍历新的集合的信息
        for (int i = 0; i < result.size(); i++) {
            Phone p = result.get(i);
            System.out.println(p.getBrand() + "," + p.getPrice());
        }
    }
    //如果要返回多组数据,可以先把数据放进容器(数组,集合)再返回
    public static ArrayList<Phone> LowPhoneinfo(ArrayList<Phone> list){
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);//得到集合里的每个对象
            if(p.getPrice() < 3000){
                result.add(p);
            }
        }
        return result;
    }
}

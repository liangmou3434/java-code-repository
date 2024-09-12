import java.util.ArrayList;

public class Util {//学生工具类 - 用来获取集合中最大年龄的学生
    public static int getMax(ArrayList<Student> list){
        int max = list.get(0).getAge();//先默认集合内的第一个对象的年龄为最大值,用其他对象与之比较
        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getAge() > max){//把最大的年龄值值赋给age
               max = stu.getAge();
            }
        }
        return max;
    }
}

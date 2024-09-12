import java.util.ArrayList;

public class StudentTest {//再集合中放置三个学生对象 再利用工具类的测试方法找到集合中最大的年龄

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",19,"男");
        Student stu2 = new Student("小乔",21,"女");
        Student stu3 = new Student("李四",18,"男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);//把学生对象们放进集合里
        System.out.println("集合中年龄最大为: "+Util.getMax(list));
    }
}

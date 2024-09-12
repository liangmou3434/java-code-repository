import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {//定义一些学生对象 并进行遍历 要求对象的数据来自键盘录入

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();//创建一个空参的集合
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu1 = new Student();//创建空的学生对象
            System.out.print("请输入第"+(i+1)+"个学生姓名: ");
            String name = sc.next();
            stu1.setName(name);
            System.out.print("请输入第"+(i+1)+"个学生年龄: ");
            int age = sc.nextInt();
            stu1.setAge(age);
            list.add(stu1);//最后把学生对象放进集合里
        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}

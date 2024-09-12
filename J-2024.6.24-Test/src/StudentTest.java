public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName  = "张三";//静态成员变量优先于对象出现
        Student s1 = new Student();
        //赋值给静态成员变量 1.对象调用 2.类名调用-一般情况下用类名调用
//        s1.teacherName = "张三";

    }
}

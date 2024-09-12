package a01demo1;

public class Student {
    String name;
    int age;
    static String teacherName;//静态成员变量

    public void show(Student this) {//此方法是非静态成员方法
        // 非静态的成员方法可以访问静态的成员方法和成员变量 也可以访问非静态的成员方法和成员变量
        System.out.println(this.name + "," + this.age + "," + this.teacherName);
    }
    public static void metho(){
        System.out.println("静态成员方法");
    }
}
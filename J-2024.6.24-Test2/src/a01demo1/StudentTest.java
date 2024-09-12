package a01demo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "梁某";
        Student s1 = new Student();
        s1.name = "zhangsan";
        s1.age = 18;
        s1.show();
        System.out.println("------------------");
        Student s2 = new Student();
        s2.name = "lisi";
        s2.age = 20;
        s2.show();
    }
}

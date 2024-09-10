/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-05-12
 * Time: 23:00
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(Student.classes);//静态成员变量可以不用实例化对象 直接加类名.成员变量名即可以使用
        Student student1 = new Student();//实例化三个不同的对象
        student1.Set("liangmou2",19);
        Student student2 = new Student();
        student2.Set("liangmou2",20);
        Student student3 = new Student();
        student2.Set("liangmou3",21);
    }
}

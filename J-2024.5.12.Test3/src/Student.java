/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-05-12
 * Time: 22:59
 */
public class Student {
    public String name;
    public int age;
    public static String classes = "2023级";//用static修饰成静态成员变量
//    public static void Do(int age,String name){
//        int age;//会发生错误
//        System.out.println();
//    }
    public void Set(String name,int age){
        //static可以修饰成员方法 将成员方法变成静态成员方法 但静态成员方法内部不能访问非静态成员方法和非静态成员变量
        this.name = name;
        this.age = age;
        System.out.println("姓名："+name+" "+"年龄："+age+"年级： "+classes);
    }
}


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-05-12
 * Time: 18:25
 */
public class Student{
    private String name;//private意为私人的 只能在Student类的内部访问-》main主函数内不能访问
    public int age;//公开的成员属性 任何地方都可以访问
    public void SetName(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("姓名："+name+"年龄："+age);
    }

    public static void main(String[] args) {
        Student student = new Student();//对类进行实例化
        //name 只能在类的内部进行访问 但方法是公开的 此时可以用方法对name进行访问
        student.SetName("梁某",19);
    }
}
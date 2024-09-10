/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-05-07
 * Time: 17:33
 */
public class Student {
    public String name;
    public int age;
   public Student(){//没有返回值，方法名与类名相同为构造方法 -》 可以带参数
        //this(参数1，参数2)-》先调用本类当中带参数的其他构造方法
       //this（参数1，参数2）智能放在构造方法的第一行且不能循环使用
//        this("梁某",19);
        System.out.println("haha");
    }
   public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("hehe");
    }

    public static void main(String[] args) {
        Student student = new Student();//调用不带参数的构造方法
        Student student2 = new Student("梁某",19);//调用带参数的构造方法
    }
}

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-05-07
 * Time: 17:12
 */
public class Student {//
    public String name;
    public int age;
    public void Set(String name,int age) {//有多个实例化的类时 使用this来强调成员属性的值
      this.name = name;
      this.age = age;
    }
   public void Use(){
        System.out.println(this.age+"岁的"+this.name);//在成员方法调用成员属性时加入this引用
   }
    public static void main(String[] args) {
        Student student = new Student();
        student.Set("梁某",19);
        student.Use();
    }
}

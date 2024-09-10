/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-05-07
 * Time: 16:29
 */
class Dog{
    public String name;    //名字和颜色为成员属性
    public String color;
    public void barks(){   //两个行为为成员方法
        System.out.println(name+"汪汪叫……");
    }
    //
    public void wag(){
        System.out.println(name+"摇尾巴……");//成员方法内可以拼接上成员属性
    }
}
public class Test {
    public static void main(String[] args) {
        //将狗 类实例化
        Dog dog = new Dog();//将成员属性具体化
        dog.name = "旺财";//访问成员属性
        dog.color = "黄色";
        System.out.println(dog.name);//打印已经赋值的成员属性
        System.out.println(dog.color);
        dog.barks();//访问成员方法
        dog.wag();
    }
}

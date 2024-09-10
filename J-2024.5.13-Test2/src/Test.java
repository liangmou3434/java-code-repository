
class student{
    public int age;//非静态成员变量
    public String name;
    public static int high;//静态成员变量
    public static int weight;
}
class Test1{
    {
        int age = 19;
        String name = "梁某";
        System.out.println(name+"现在是"+age+"岁");//此处为实例代码块 用来初始化实例成员变量
    }
    static {//静态代码块 初始化静态的成员变量
        int high = 150;
        int weight = 50;
        System.out.println("梁某现在高"+high+"体重是"+weight);
    }
}
public class Test {//先执行静态代码块，再执行实例代码块 最后执行main函数内部程序
    public static void main(String[] args) {
        Test1 test = new Test1();//把类实例化后能直接执行静态代码块和实例代码块的内容
    }
}

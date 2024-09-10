
class Base{//父类
    public int a = 20;
    public int b;
}
class Second extends Base{
    int a;
    public int c;//子类特有的成员属性
    public void method(){//子类
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a);//访问的是子类的a
        System.out.println(b);
        System.out.println(c);
        System.out.println(super.a);//访问的是父类的a
        //当子类与父类的成员方法或成员变量同名时 需使用父类的成员方法或成员变量 用super关键字修饰
    }
}
public class Test {
    public static void main(String[] args) {
        Second second = new Second();
        second.method();
    }
}

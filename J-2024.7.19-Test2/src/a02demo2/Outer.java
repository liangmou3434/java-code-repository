package a02demo2;

public class Outer {//静态内部类只能访问外部类中静态的成员,非静态的需要创建对象来访问
    //注意事项：
//1.静态内部类也是成员内部类中的一种
//2.静态内部类只能访问外部类中的静态变量和静态方法，
//    如果想要访问非静态的需要创建对象。
//创建静态内部类对象的格式：外部类名.内部类名对象名=new外部类名.内部类名（)；
//调用静态方法的格式：外部类名.内部类名.方法名（）
    static class Inner{
        public void show(){
            System.out.println("内部类中非静态的成员方法");
        }
        static void show1(){
            System.out.println("内部类中静态的成员方法");
        }
    }
}

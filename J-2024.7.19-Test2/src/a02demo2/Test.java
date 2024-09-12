package a02demo2;

public class Test{
    public static void main(String[] args) {
        //创建静态内部类对象的格式：外部类名.内部类名对象名=new外部类名.内部类名（)；
        Outer o = new Outer();
        Outer.Inner oi = new Outer.Inner();//创建静态内部类对象
        oi.show();//调用非静态的内部类的成员方法

        //调用静态的成员方法
        //调用静态方法的格式：外部类名.内部类名.方法名（）
        Outer.Inner.show1();
    }
}

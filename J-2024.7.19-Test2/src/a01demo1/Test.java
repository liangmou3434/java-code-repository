package a01demo1;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
//        创建内部类的对象
//        格式：外部类名.内部类名对象名=外部类对象.内部类对象；
//        Outer.Inner oi =new Outer().new Inner();//原理和链式编程类似
        //链式编程的适应,例
//        Outer o = new Outer();
//        System.out.println(o.name);

        System.out.println(new Outer().name);//用链式编程的方式减少使用变量来创建新的对象直接调用成员变量或成员方法
    }
}

package a01demo1;

public class Outer {
    private int a = 10;
//    public void show(){
//        //在外部类里创建内部类的对象,再调用外部类的show方法为方式一
//        Inner i = new Inner();
//    }
    String name = "张三";
    private class Inner{
        private int a = 20;
        public void show(){
            int a = 30;
            System.out.println(a);//30
            System.out.println(this.a);//20
            System.out.println(Outer.this.a);//30
            //在内部类内访问外部类大成员变量--外部类名.this.变量名
        }
//        编写成员内部类的注意点：
//        1.成员内部类可以被一些修饰符所修饰，比如：private(只能在本类中访问,外部类可以访问)
//        默认(在本包中可以访问)，protected(在本包其他类和其他包的子类可以访问)，public，static等
//        2.在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量。
//
//        获取成员内部类对象的两种方式：(假如内部类是私有类,就只能通过方式一访问)
//        方式一：外部类编写方法，对外提供内部类对象
//        方式二：直接创建
//        格式：外部类名.内部类名对象名=外部类对象.内部类对象；
//        范例：Outer.Inner oi =new Outer().new Inner();
    //        static int a = 20;//定义静态变量
    }
}

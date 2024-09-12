package a03demo3;

public class Outer {
    private int b = 20;
    public void show(){
        int a = 10;
        class Inner{//局部内部类,写在方法里,修饰符和局部变量a的相同,可以修饰局部变量a的修饰符同样可以修饰局部内部类
           String name = "张三";
           int age = 18;

           public void method1(){
               System.out.println("局部内部类的方法method1");
           }
           public void method2(){
               System.out.println("局部内部类的方法method2");
           }
        }
        //外界不能直接使用局部内部类的成员,需要在方法里面创建对象调用
        Inner i = new Inner();
        System.out.println(i.name);
        i.method1();
        System.out.println(a);
        System.out.println(b);//局部内部类所在的方法可以直接访问外部类的变量,也可以访问方法内的局部变量
    }
}

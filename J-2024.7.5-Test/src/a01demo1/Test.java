package a01demo1;

public class Test {//多态调用成员特点
    public static void main(String[] args) {
        Animal a = new Dog();//用多态的方法创建对象
        //变量调用--编译看左边,运行也看左边
        //方法调用--编译看左边,运行看右边
        System.out.println(a.name);
        //编译看左边-查看父类中是否有该方法,有则编译成功,没有则编译失败
        //运行看左边-查看父类是否有该成员变量,有则执行,没有则报错
        a.show();
        //编译看左边-查看父类中是否有该方法,有则编译成功,没有则编译失败
        //运行看右边-查看子类是否有该成员方法,有则执行,没有则报错
    }
}

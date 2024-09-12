package a02demo2;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();//使用多态的方法创建对象
        a.eat();
        //1)在多态的形势下,右边的对象可以实现解耦合,便于扩展和维护
        //2)定义方法时.使用父类可以作为参数,可以接受所有子类对象,便于多态的扩展性和便利
        //弊端:不能调用子类的特有功能

        //需要调用子类的特有功能-把对象转换成子类类型
//        Dog d = (Dog) a;//将a强制转换成Dog类型
        if(a instanceof Dog){//判断a是否是Dog类型 返回结果为布尔类型

        }
    }
}


public class Test {
    public static void main(String[] args) {
        Dog a = new Dog();//实例化一个狗对象
        a.setAge(3);//private修饰的成员变量要通过set方法来进行赋值
        a.name = "旺财";
        System.out.println(a.getAge());//打印用private修饰的成员变量
        a.Eat();//使用类的方法赋值后可以直接调用
        a.Bark();

    }
}

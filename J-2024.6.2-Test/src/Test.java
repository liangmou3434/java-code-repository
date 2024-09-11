public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("张三",3);//实例化一个对象
        //当构造方法没有参数时 idea会自动创建一个不含参的构造方法传递过来
        //写了有参数构造方法后 要写实参传到构造方法，直接赋值
        d.Bark();
        d.Eat();
    }
}

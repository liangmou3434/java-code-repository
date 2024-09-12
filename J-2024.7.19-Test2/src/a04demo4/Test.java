package a04demo4;

public class Test {
    //匿名内部类本质上是类的子类,或者接口的实现类
    public static void main(String[] args) {
        Swim s = new Swim() {//匿名内部类,需要重写接口或类中所有的抽象方法
            //Swin s = new Swim();//接口的多态:通过接口类型引用来调用实现类的方法
            @Override
            public void swim() {
                System.out.println("重写接口的抽象方法");
            }
        };
    }
}

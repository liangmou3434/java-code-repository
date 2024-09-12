package a02demo2;

public class frog extends Animal {
    //抽象子类必须重写父类的抽象方法
    public frog() {
    }
    public frog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("青蛙吃虫子");
    }
}

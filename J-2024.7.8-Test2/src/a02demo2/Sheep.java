package a02demo2;

public class Sheep extends Animal{
    //抽象子类必须重写父类的抽象方法 但子类不一定要是抽象类
    public Sheep() {
    }
    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("山羊吃草");
    }
}

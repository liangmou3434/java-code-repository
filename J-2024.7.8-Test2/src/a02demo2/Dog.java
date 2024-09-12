package a02demo2;

public class Dog extends Animal {
    //抽象子类必须重写父类的抽象方法

    public Dog() {
    }
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
}

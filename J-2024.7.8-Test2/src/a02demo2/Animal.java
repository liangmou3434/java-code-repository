package a02demo2;

public abstract class Animal {
//    青蛙frog 属性：名字，年龄
//    行为：吃虫子，喝水
//     狗Dog  属性：名字，年龄
//    行为：吃骨头，喝水
 //   山羊Sheep 属性：名字，年龄
//    行为：吃草，喝水
    private String name;
    private int age;

    public Animal() {
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();//抽象方法,(抽象类中不一定有抽象方法,但有抽象方法的类一定是抽象类)
    public void drink(){
        System.out.println("动物在喝水");
    }
}

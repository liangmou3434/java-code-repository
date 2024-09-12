package a01demo1;

public abstract class Person {//abstract关键字--子类强制重写父类的方法
    private String name;
    private int age;

    public Person() {
    }
    public Person(String name, int age) {
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

    public abstract void show();//抽象方法,子类必须重写,而且父类没有方法体
}

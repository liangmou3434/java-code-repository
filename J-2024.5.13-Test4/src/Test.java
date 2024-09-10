class Animal{//父类
    public String name;
    public int age;
    public void eat(){
        System.out.println(name+"正在吃饭");
    }
    public Animal(String name,int age){//带成员属性的有参数的构造方法（构造方法没有返回值）
        this.name = name;
        this.age = age;
    }
}
class Dog extends Animal{
    public boolean silly;
    public Dog(String name,int age,boolean silly){//子类的构造方法
        super(name,age);//使用super关键字给父类的成员属性先赋值时，需要父类有带参数的构造方法
        this.silly = silly;
    }
    public void barks(){
        System.out.println(name+"汪汪叫");
        System.out.println(name+"汪汪叫");
    }
}
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("梁某",19,false);
    }
}

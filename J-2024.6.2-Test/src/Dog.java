public class Dog {
    public String name;
    public int age;
    public Dog(String name,int age){///构造方法：public + 类名 与类名相同 没有返回参数
        this.name = name;
        this.age = age;
    }
    public void Bark(){
        System.out.println(age+"岁的"+name+"正在汪汪叫……");
    }
    public void Eat(){
        System.out.println(age+"岁的"+name+"正在吃饭……");
    }
}

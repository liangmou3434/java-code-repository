public class Animal {
    public String name;
    //子类无法访问 成员方法和成员变量用priavte修饰
    //private--只能在本类访问
    //子类只能访问父类中非私有的成员
    //构造方法-子类不能继承
    //成员变量-子类都能继承
    //成员方法-子类只能继承非私有的 不能继承私有的
    public void eat(){
        System.out.println(name + "正在吃饭");
    }
    public void drink(){
        System.out.println(name + "正在喝水");
    }
}

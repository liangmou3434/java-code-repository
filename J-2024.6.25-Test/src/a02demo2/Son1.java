package a02demo2;

public class Son1 extends Father1 {
    String name = "son";
    String hobby = "吃鸡";
    public void show1(){
        //打印father
        System.out.println(super.name);
        //打印son
        System.out.println(this.name);
//        System.out.println(name);
        //打印喝茶
        System.out.println(super.hobby);
        //打印吃鸡
        System.out.println(this.hobby);
//        System.out.println(hobby);
    }
    @Override//方法的重写:子类中方法名与父类一致 父类方法无法满足子类的需求
    //重写注解 @verride放在重写后的方法上,检验子类重写时语法是否正确
    public void eat(){
        System.out.println("吃意面");
    }
    @Override
    public void drink(){
        System.out.println("喝凉茶");
    }
    public static void main(String[] args) {
        Son1 s = new Son1();
        s.show1();
    }
}

package a01demo1;

public class Son extends Father{
    String name = "son";
    public void show(){
        String name = "son1";
        System.out.println(name);//成员变量的访问特点为就近原则 直接访问方法内的name变量 没有再访问类中的
        System.out.println(this.name);//直接访问类的成员变量
        System.out.println(super.name);//访问父类的成员变量
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.show();
    }
}

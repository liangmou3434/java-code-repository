public class Test {
    public static void main(String[] args) {//使用多态的前提
        // 1)有继承关系
        // 2)有父类引用指向子类对象
        //3)有方法重写
        //用父类类型作为参数可以接收所有子类对象e
        Student s = new Student("张三",18);
        Teacher t = new Teacher("李四",25);
        show(s);
        show(t);

    }
     public static void show(Person p){
       p.show();
     }
}

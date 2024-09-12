package a02demo2;

public class Student extends Person {
    public Student() {
        super();//调用父类的无参构造
        //不写要存在 必须放在子类无参构造的第一行
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age) {
        super(name, age);//调用父类的有参构造对父类的成员属性赋值

    }
}

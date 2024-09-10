
class Student{
    private String name;//name为私有的成员变量 访问该私有的成员变量
    public int age;
    public String classes;
    public String getName(){
        return name;
    }
    public void SetName(String name){//访问私有的成员变量用get set//
        this.name = name;
    }
    public void eat(){
        System.out.println(classes+"的"+getName()+"在吃饭");
    }
}
public class Test{
    public static void main(String[] args) {
        Student student = new Student();
       student.SetName("梁某");
       student.age = 19;
       student.classes = "2023级";
       student.eat();
    }
}


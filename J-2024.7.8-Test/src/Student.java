public class Student {
    private String name;
    private int age;
    static{
        //静态代码块 写在成员位置-只能添加静态变量
    }//静态代码块-需要用static关键字修饰,随着类的加载而加载并自动触发,只能执行一次

//   //构造代码块--优先于构造方法执行
//   {
//       System.out.println("执行构造代码块");//不够灵活
//   }
 // 解决构造代码块功能的方法
    //1)
//           public Student() {
//           this(null,0);//调用有参构造,给成员变量赋一些默认值
//            }
//            public Student(String name, int age) {
//                System.out.println("构造方法");
//                this.name = name;
//                this.age = age;
//            }
    //2)把重复的方法写在一个成员方法内,有参构造和无参构造调用该成员方法

    public Student() {
        System.out.println("空参构造");
    }
    public Student(String name, int age) {
        System.out.println("有参构造");
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
}

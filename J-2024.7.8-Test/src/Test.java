public class Test{//代码块分类
    //局部代码块--提前结束变量的生命周期(不常用)
    //构造代码块-优先于构造方法执行,写在成员位置,可以把多个构造方法中重复写的代码抽取出来(不够灵活)
    //静态代码块 static{}
    public static void main(String[] args) {
        {
            int a = 10;
            System.out.println(a);//变量a出了局部代码块生命周期结束,不能再打印
        }
//        System.out.println(a);//报错

        Student s = new Student();

    }
}

public class Test {
    public static void main(String[] args) {
//        编写带有接口和抽象类的标准Javabean类
//      青蛙 属性：名字，年龄
//          行为：吃虫子，蛙泳
//       狗  属性：名字，年龄
//        行为：吃骨头，狗刨
//       兔子 属性：名字，年龄
//        行为：吃胡萝卜



        //接口用interface关键字定义
        //例子:public interface 类名{}
        //接口和类之间是实现关系,通过implement关键字表示
        //public class 类名 implements关键字表示
        //例:public class 类名 implements 接口名{}

        //接口的子类-1)要么重写接口中所有的抽象方法
        //2)要么是抽象类

        //1)接口和类的实现关系,可以但实现,也可以多实现
        //例:public class 类名 implements 接口1,接口2{}
        //2)实现类还可以在继承一个类同时实现多个接口
        //例:public class 类名 extends 父类 implements 接口1,接口2{}
        dog d = new dog("旺财",3);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.Swim();

        frog f = new frog("青蛙",2);
        System.out.println(f.getName() + "," + f.getAge());
        f.eat();
        f.Swim();

        rabbit r = new rabbit("兔子",4);
        System.out.println(r.getName() + "," + r.getAge());
        r.eat();
    }
}

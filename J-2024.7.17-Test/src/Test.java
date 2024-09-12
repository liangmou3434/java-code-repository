public class Test implements Inter1,Inter2 {
    //JDK7以前:接口只能定义抽象方法

    //JDK8新增的特性:接口可以定义有方法体的方法(默认静态)--允许在接口中定义默认方法,用default关键字修饰
    //作用:解决接口升级的问题
    //格式:public default 返回值类型 方法名(){}
    //1)默认方法不强制被重写,如果被重写,去掉default关键字
    //2)public可以省略,default不能省略(在接口中)
    //3)如果实现多个接口,接口中存在相同名字的默认方法,子类就必须对该方法重写

    //静态方法
    //格式:public static 返回值类型 方法名(){}
    //1)静态方法只能通过接口名调用,不能通过实现类或对象名调用
    //JDK9的新特性:接口可以定义私有的方法
    @Override
    public void show(){
        System.out.println("重写接口1的默认方法");//不强制被重写,如果被重写,去掉default关键字
    }

    @Override
    public void method(){
        System.out.println("重写接口1和接口2同名的默认方法");
    }
}

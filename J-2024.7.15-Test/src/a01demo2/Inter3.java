package a01demo2;

public interface Inter3 extends Inter1,Inter2{//接口可以多继承也可以单继承
    //Inter3是Inter1和Inter2的子类,也是接口最下面的实现类(接口最底下的子类)
    public abstract void method3();
}

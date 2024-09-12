package a01demo1;

public class Test1 implements Inter1,Inter2{
    @Override//类接上多个接口,需要重写所有接上的接口里面所有的抽象方法,如果有重名的就只写其中一个
    //例如Inter1接口和Inter2接口都有menthod3方法,类中就只需要写一个method3方法
    public void method1(){
    }
    @Override
    public void method2(){
    }
    @Override
    public void method3(){
    }
    @Override
    public void method4(){
    }
    @Override
    public void method5(){
    }
}

public abstract class InterAdapter implements Inter{//中间类--实现接口,重写接口中所有的抽象方法
//    为了避免其他类创建适配器的对象,中间类需要用abstract修饰
    @Override
    public void method1(){
        System.out.println();
    }
    @Override
    public void method2(){
        System.out.println();
    }
    @Override
    public void method3(){
        System.out.println();
    }

    //
}

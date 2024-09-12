public class Test extends InterAdapter {//适配器设计模式,解决接口与接口实现类之间的矛盾问题
    //只重写接口中的某个抽象方法,用一个中间类,类继承中间类,中间类重写接口的所有方法,类重写自己的需要的方法

    //1)编写中间类 xxxAdapter,实现对应接口
    //2)对接口中的抽象方法进行空实现
    //3)让真正的实现类继承中间类,并重写需要用的方法
    //4)为了避免其他类创建适配器的对象,中间类需要用abstract修饰
    @Override
    public void method3(){
        System.out.println("只重写需要的方法3");
    }
}

public interface Test {//接口的成员特点
    //1)成员变量--只能是常量,默认修饰符为public static final
    //2)构造方法--接口没有构造方法-且接口不能实例化
    //3)成员方法-接口只能写抽象方法--默认修饰符为public abstract
    int a = 10;
    public abstract void way();
}

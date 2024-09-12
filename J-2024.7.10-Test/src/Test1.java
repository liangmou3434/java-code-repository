import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test1 implements Test{
    @Override
    public void way(){
        System.out.println("接口的抽象方法");
    }//若类接上了多个接口,并且多个接口有相同方法名的抽象方法,接上接口的类只需要写一个方法体
    public static void main(String[] args) {
        System.out.println(a);  //1)成员变量--只能是常量,默认修饰符为public static final
//        a = 20;//报错
        //接口中如果有抽象方法,接上接口的子类必须重写接口所有的抽象方法

    }
}



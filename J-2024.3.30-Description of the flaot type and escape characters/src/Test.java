/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-03-30
 * Time: 21:29
 */
public class Test {
    public static void main(String[] args) {
       float a = 3.5f;//明确地指定该字面量为float类型
        //省略了f或F，那么编译器会尝试将字面量(默认为double)转换为float，
        // 但这实际上是一个从double到float的向下转换，可能会导致精度损失
        //float类型的字面量需要在数字后面加上f或F来表示它是一个float，否则编译器会默认它是double类型
    }
    public static void main2(String[] args) {
       short a = 128;//short类型两个字节可以存下128
        byte b =(byte)a;//将a强制转换类型变成byte类型
        System.out.println(a);
       System.out.println(b);//b为byte类型只能存下127 127+1=-128
    }
    //灵活运用转义字符 输出\"hello\"
    public static void main1(String[] args) {
        System.out.println("hello");//直接输出hello
        System.out.println("\\");//输出反斜杠
        System.out.println("\\\"hello\\\"");
    }
}

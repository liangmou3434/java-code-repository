/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-04
 * Time: 21:36
 */
public class Test {
    //关系表达式的运算符是true或false
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        System.out.println(a < b);//结果为true
        System.out.println(a >= b);//结果为false
        System.out.println(a == b);//结果为false
    }
    public static void main1(String[] args) {
        int a = 10;
        double b = 2.5;
        a+=b;//a=a+b 此处将a+b赋值给a变成int类型
        System.out.println(a);//最终结果为12
    }
}

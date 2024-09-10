/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-09
 * Time: 16:30
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a+((b-a)>>1);//c为a+b的平均数 >>右移1为除2
        System.out.println(c);

        int d = 5;
        int e = (d << 1);//左移1 左移的实际意思为乘2
        System.out.println(e);
    }
}

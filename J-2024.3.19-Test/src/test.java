/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-03-19
 * Time: 16:07
 */
public class test {
    /**
     *字符型类型
     */


    public static void main(String[] args) {
        char ch ='a';
        System.out.println(ch);
    }
    public static void main6(String[] args) {
        double number1 = 1.1;
        double number2 = 1.1;
        System.out.println(number1*number2);
        //结果为1.2100000000000002 浮点数是个近似值 不是精确值
    }
    public static void main5(String[] args) {
        /**
         *双精度浮点型   8个字节->64个比特位-63个比特位存放数值->-2^63-  (2^63)-1
         */
        double a = 12.5;
        System.out.println(a);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double .MIN_VALUE);
        //强制类型转换的两种方法
        float b =(float)12.5;
        float c =12.5f;
        System.out.println(b);
        System.out.println(c);
    }
    public static void main4(String[] args) {
        /**
         * 字节类型 ->一个字节->8个比特位 8-1=7 -2^7 -（2^7）-1
         *共256个数字
         */
        byte number = 10;
        System.out.println(number);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
    public static void main3(String[] args) {
        /**
         * 短整型 -2个字节->16个比特位-1-15 -2^15-（2^15）-1
         */
        short sh = 10;
        System.out.println(sh);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }
    public static void main2(String[] args) {
        /**
         * 长整型 8个字节->64个比特位-63个比特位存放数值->-2^63-  (2^63)-1
         */
        long a = 10;
        System.out.println(a);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        long b = 10L;//10L->意思是10是long类型
        System.out.println(b);
    }
    public static void main1(String[] args) {
        //局部变量占4个字节
        int a = 10;       //Integer 为plus版的int
        System.out.println(Integer.MAX_VALUE);//输出int 类型能够输出的最大值
        System.out.println(Integer.MIN_VALUE);//输出int 类型能够输出的最小值
        //int c; 未初始化就打印的值会报错 使用之前一定要对变量进行初始化
        //System.out.println(c);
    }
}

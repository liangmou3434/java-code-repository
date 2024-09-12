import java.math.BigInteger;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        public BigInteger(int num,Random rnd)        获取随机大整数，范围：[θ～2的num次方-1]
//        public BigInteger(String val)                获取指定的大整数
//        public BigInteger(String val,int radix)      获取指定进制的大整数
//        public static BigInteger valueOf(long val)   静态方法获取BigInteger的对象，内部有优化

        //1.获取一个较大的随机整数
        Random r = new Random();
//        BigInteger bd1 = new BigInteger(2, new Random());
        BigInteger bd1 = new BigInteger(4, r);//获取到的bd1为2的四次方-1
        //获取的bd1随机数为0~15 包括0也包括15
        System.out.println(bd1);

        //2.获取一个指定大的整数-不能是随机数,也不能是字母
        BigInteger bd2 = new BigInteger("9999999999999");
        System.out.println(bd2);//9999999999999

        //3.获取指定进制的大整数
        //字符串中的数字必须是整数且字符串中的数字必须要与进制吻合
        //比如二进制数字就只能写0和1
        BigInteger bd3 = new BigInteger("100",10);//表示一百是十进制的一百
        BigInteger bd4 = new BigInteger("100",2);
        //一百是二进制的一百,但编译器会将二进制的一百转换成十进制再打印在控制台上
        System.out.println(bd3);//100
        System.out.println(bd4);//4

        //4.静态方法获取BigInteger对象,内部有优化
        //valueOf能表示的范围比较小,不能超出long类型
        //2.在内部对常使用的数字 -16~16进行了优化
        //提前把-16~16先创建好了BigInteger的对象,如果多次获取不会重新创建对象
        BigInteger bd5 = BigInteger.valueOf(100);
        System.out.println(bd5);

        BigInteger bd6 = BigInteger.valueOf(16);
        BigInteger bd7 = BigInteger.valueOf(16);
        System.out.println(bd6 == bd7);//结果为true-比较的是bd6和bd7的地址值,说明bd7没有创建新的对象,而是获取bd6的地址值

        BigInteger bd8 = BigInteger.valueOf(17);
        BigInteger bd9 = BigInteger.valueOf(16);
        System.out.println(bd8 == bd9);//false-小于-16或大于16,编译器就会重新创建对象

        //5.对象创建后内部的数据不能发生改变
        BigInteger bd10 = BigInteger.valueOf(1);
        BigInteger bd11 = BigInteger.valueOf(2);
        BigInteger result = bd10.add(bd11);
        System.out.println(result);//结果为3
        //不会改变参与运算的BigInteger对象中的值,而是产生了一个新的Biginteger对象用来记录3

        System.out.println(bd10 == result);//false
        System.out.println(bd11 == result);//false

//①如果BigInteger表示的数字没有超出long的范围，可以用静态方法获取。
//②如果BigInteger表示的超出long的范围，可以用构造方法获取。
//③对象一旦创建，BigInteger内部记录的值不能发生改变。
//④只要进行计算都会产生一个新的BigInteger对象
    }
}

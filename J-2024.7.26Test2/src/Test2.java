import java.math.BigInteger;

public class Test2 {
    public static void main(String[] args) {
//        public BigInteger add(BigInteger val)                  加法
//        public BigInteger subtract(BigInteger val)             减法
//        public BigInteger multiply(BigInteger val)             乘法
//        public BigInteger divide(BigInteger val)               除法，获取商
//        public BigInteger[] divideAndRemainder(BigInteger val) 除法，获取商和余数
//        public boolean equals(object x)                        比较是否相同
//        public BigInteger pow(int exponent)                    次幂
//        public BigInteger max/min(BigInteger val)              返回较大值或较小值
//        public int intValue(BigInteger val)                    转为int类型,超出范围数据有误

        //1.先创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2.加法(减法,乘法,除法类似)
        BigInteger bd3 = bd1.add(bd2);//15
        System.out.println(bd3);

        //3.除法,获取商和余数
        //下标为0的为商,下标为1的为余数
        BigInteger[] bd4 = bd1.divideAndRemainder(bd2);
        for (int i = 0; i < 2; i++) {
            System.out.print(bd4[i] + " ");
        }
        System.out.println();
        //4.比较是否相同
        boolean result = bd1.equals(bd2);
        System.out.println(result);

        //5.次幂
        BigInteger bd5 = bd2.pow(2);//括号内为次幂数,bd2为5,结果为5的平方
        System.out.println(bd5);

        //6返回较大值和较小值,举例为返回较大值,较小值类似
        BigInteger bd6 = bd1.max(bd2);
        System.out.println(bd6);

        //7.转为int类型,超出范围数据有误
        BigInteger bd7 = BigInteger.valueOf(1000);
        int i = bd7.intValue();
        System.out.println(i);//1000
    }
}

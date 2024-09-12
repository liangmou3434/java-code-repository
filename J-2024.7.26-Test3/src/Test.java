import java.math.BigDecimal;


public class Test {
    public static void main(String[] args) {
        //BigDecima的作用
        //用于小数的精确计算,用来表示很大的小数

        //用构造方法来获取BigDecimal对象
//        public BigDecimal(double val)
//        public BigDecimal(String val)

//        静态方法获取BigDecimal对象
//        public static BigDecimal valueOf(double val)

        //1.通过传递double类型的小数来创建对象
        //这种方式有可能是不精确的,不推荐使用
//        BigDecimal bd1 = new BigDecimal(0.01);
//        BigDecimal bd2 = new BigDecimal(0.09);
//        System.out.println(bd1);//0.01000000000000000020816681711721685132943093776702880859375
//        System.out.println(bd2);//0.0899999999999999966693309261245303787291049957275390625

        //2.通过字符串来传递小数
       BigDecimal bd3 = new BigDecimal("0.01");
       BigDecimal bd4 = new BigDecimal("0.09");
       BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);//0.01
        System.out.println(bd4);//0.09
        System.out.println(bd5);//0.10

        //3.通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd6);

        //如果表示的数字不大,没有超出double范围,使用静态方法
        //如果表示数字较大,超出了double范围,使用构造方法
        //如果传递的是0~10之间的整数,包括0,包括10,那么方法会返回已经创建好的对象,不会重新new

        BigDecimal bd7 = BigDecimal.valueOf(10);
        BigDecimal bd8 = BigDecimal.valueOf(10);
        System.out.println(bd7 == bd8);//true-如果传递的是0~10之间的整数,包括0,包括10,那么方法会返回已经创建好的对象,不会重新new
        //传递的只能是整数,如果是10.0,那么编译器也会new一个新的对象


        BigDecimal bd9 = BigDecimal.valueOf(20);
        BigDecimal bd10 = BigDecimal.valueOf(20);
        System.out.println(bd9 == bd10);//false-如果是超过10的整数,编译器就会重新new一个对象
    }
}

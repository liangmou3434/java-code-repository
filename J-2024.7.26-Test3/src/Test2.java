import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test2 {
    public static void main(String[] args) {
//        public static BigDecimal valueof(double val)             获取对象
//        public BigDecimal add(BigDecimal val)                    加法
//        public BigDecimal subtract(BigDecimal val)               减法
//        public BigDecimal multiply(BigDecimal val)               乘法
//        public BigDecimal divide(BigDecimal val)                 除法-余数为0(被除数能够被除尽)
//        public BigDecimal divide(BigDecimal val,精确几位，舍入模式） 除法-余数不为0(被除数无法被除尽)
//        //如果被除数无法被除尽却使用了第一个除法,就会报错

        //1.获取对象
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(5.0);

        //2.加法
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);//15

        //3.减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);//5

        //4.乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);//50

        //5.除法
        BigDecimal bd6 = bd1.divide(bd2);
        System.out.println(bd6);//2

        //6.除法,精确几位,舍入模式
        BigDecimal bd7 = bd1.divide(bd2,2, RoundingMode.HALF_UP);//ROUND_HALF_UP--四舍五入
        //精确到两位
        System.out.println(bd7);
    }
}

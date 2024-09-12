public class Test {
    public static void main(String[] args) {
//        Integer的成员方法-都是静态方法,所以需要通过类名来调用
//        public static String toBinaryString(int i) 得到二进制
//        public static String toOctalstring(int i)  得到八进制
//        public static String toHexString(int i)    得到十六进制
//        public static int parseInt(String s)       将字符串类型的整数转成int类型的整数

        //1.得到二进制
        String str1 = Integer.toBinaryString(100);//将100转成二进制数字
        System.out.println(str1);//1100100

        //2.得到八进制
        String str2 = Integer.toOctalString(100);//将100转成八进制数字
        System.out.println(str2);//144

        //3,得到十六进制
        String str3 = Integer.toHexString(100);//将100转成16进制
        System.out.println(str3);//64

        //将字符串类型的整数转换成int类型的整数
        String str4 = "100";
        int i = Integer.parseInt(str4);//将字符串100转成int类型100
        System.out.println(i);//100

        //在类型转换时,括号中的参数只能是数字不能是其他,否则代码会报错
        //8种包装类中,除了Character都有对应的parsexxx方法进行类型转换
    }
}

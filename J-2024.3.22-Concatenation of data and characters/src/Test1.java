/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-03-22
 * Time: 14:40
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "2004";//1
        int a = Integer.parseInt(str);
        System.out.println(a+1);
    }

    public static void main4(String[] args) {
        //字符串与字符串的拼接
       String s1 = "hello ";
       String s2 = "world ";
        System.out.println(s1+s2);

        //借助方法
        //String ret = String.valueOf(10);
        // System.out.println(ret);

        int a = 10;
        String b = a+"";//强制类型转换，将字符串类型转换成int类型
        System.out.println(b);
    }

    public static void main3(String[] args) {
        //字符串类型 String
        String s = "广州南方学院";
        System.out.println(s);
    }
    public static void main2(String[] args) {
        boolean b = true;//boolean类型只有true和false
        System.out.println(b);
        //boolean和int不能进行类型转换
    }
    public static void main1(String[] args) {
        /**
         *字符 ->两个字节，没有负值 0-2^15
         */
     char ch = '梁';//
     char sh = 97;//根据ASCII码值输出小写a
        System.out.println(ch);
        System.out.println(sh);
    }

}

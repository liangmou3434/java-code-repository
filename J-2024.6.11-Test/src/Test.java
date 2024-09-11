import java.util.Scanner;

public class Test {//对于字符串的赋值说明
    public static void main(String[] args) {
        //1.直接赋值
        String s1 = "abc";
        System.out.println("s1="+s1);
        //2.空参构造
        String s2 = new String();
        System.out.println("s2="+s2);
        //3.带参构造
        String s3 = new String("abc");
        System.out.println("s3="+s3);
        //4.字符数组
        char[] arr = {'a','b','c'};
        String s4 = new String(arr);
        System.out.println("s4="+s4);
        //5.字符数组 字符数组是通过ASCII码表内的值转化成对应数组再转化成字符串
        byte[] arr1 = {97,98,99};
        String s5 = new String(arr1);
        System.out.println("s5="+s5);
    }
}

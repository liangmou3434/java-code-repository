import java.util.Scanner;

public class Test {//判断两个字符串是否相等

    public static void main(String[] args) {
        //== 判断相等符号 在基本数据类型中 判断相等符号比较的是数据值 引用数据类型比较的是地址值
        int a = 10;
        int b = 20;
        System.out.println(a == b);//结果为false
        String s1 = new String("abc");
        String s2 = "abc";
        boolean result = s1.equals(s2);//s1与s2比较 这个比较方法比较的是字符串的内容 需要内容完全一样
        System.out.println(result);//结果为true
        boolean result1 = s1.equalsIgnoreCase(s2);//s1与s2比较 这个比较字符串的内容是忽略大小写的（英文）
        System.out.println(result1);//结果为true
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串： ");
        String s3 = sc.next();
        String s4 = "bcd";
        System.out.println(s3 == s4);//结果为false 键盘录入的字符串为new出来的开辟了一块新的空间
    }
}

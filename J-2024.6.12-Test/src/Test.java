import java.util.Scanner;

public class Test {//遍历字符串
    public static void main(String[] args) {//用键盘输入一个字符串并遍历字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串： ");
        String str = sc.next();
        int leng =  str.length();//计算字符串长度
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//i为该字符串对应的下标 返回值为字符 用char接收
            System.out.print(c+" ");//打印每个字符
        }

    }
}

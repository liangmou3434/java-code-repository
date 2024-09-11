import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入
        //第一套体系
        //nextInt();-接收整数
        //nextDouble();-接收小数
        //next();-接收字符串
        //以上字符遇到空格 制表符 回车就停止接收 符号后面的数据不会接受 但会延伸给下一次键盘录入

        //第二套体系
        //nextLint();-接收字符串 可以接收空格和制表符 遇到回车才停止接收数据

        //两套体系不能混用
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int number = sc.nextInt();//输入123 + 回车会导致后面的字符串读不到数据 会把回车直接读给后面的字符串
        System.out.println("请输入一个字符串： ");
        String s1 = sc.nextLine();
    }
}

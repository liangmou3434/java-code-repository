import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //链式编程-调用方法时不需要用变量接收结果,就可以调用其他方法
       int leng = getString().substring(1).length();
       //getStirng()返回的是一个字符串 直接用substring从下标1读取到结尾形成的一个新的字符串最后判断字符串的长度
        System.out.println(leng);//结果为2

    }
    public  static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");//abc
        String str = sc.next();
        return str;
    }
}

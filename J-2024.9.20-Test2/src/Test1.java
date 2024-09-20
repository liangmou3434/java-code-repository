import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要运算的两个操作数: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("输入你的操作符");
        String s1 = sc.next();//输入操作符
        method(s1,number1,number2);
    }

    private static void method(String s,int number1,int number2) {
        int result = 0;
        if(s.equals("+")){
            result = number1 + number2;
            System.out.println("number1 + number 2 = " + result);
        }else if(s.equals("-")){
            result =number1 - number2;
            System.out.println("number1 - number 2 = "+ result);
        }else if(s.equals("*")) {
            result = number1 * number2;
            System.out.println("number1 * number2 = " + result);
        }else if(s.equals("/")){
            double ret =number1 / number2;
            System.out.println("number1 / number2 = " + ret);
        }else if(s.equals("%")){
            result =number1 % number2;
            System.out.println("number1 % number2 = " + result);
        }

    }
}

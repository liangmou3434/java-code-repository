import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个三位数: ");
        int Figure = input.nextInt();
        int single = Figure % 10;
        int ten = Figure / 10 % 10;
        int hundred = Figure / 10 / 10;
        System.out.println("这个三位数的百位数为: "+hundred);
        System.out.println("这个三位数的十位数为: "+ten);
        System.out.println("这个三位数的个位数为: "+single);
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();//输入两个整数
        System.out.println("这两个整数的和是: "+(number1+number2));
    }
    public static void main1(String[] args) {
        System.out.println("hello world!");
    }
}

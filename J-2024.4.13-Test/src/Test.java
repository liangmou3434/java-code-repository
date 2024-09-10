import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-13
 * Time: 21:38
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();//多次输出
        int age1 = input.nextInt();
        System.out.println(age);
        System.out.println(age1);

    }
    public static void main4(String[] args) {
        System.out.println(10);//输出且换行
        System.out.print(20);//输出但不换行
        System.out.printf("%s","广州南方学院");//格式化输出
    }
    public static void main3(String[] args) {
        //fori+会回车会呈现整个for循环体
        for (int i = 0; i < 100; i++) {
            
        }
    }
    public static void main2(String[] args) {
        int i = 1;
        int ret = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//输入n
        for(int j = 1;j <= n;j++) {
            while (i <= j) {//计算n的阶乘
                ret *= i;
                i++;
            }
            sum += ret;//计算n的阶乘的和
        }
        System.out.println(ret);
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        int i = 1;
        int ret = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//输入n
        for (int j = 1;j <= n;j++) {
            ret *= j;//n的阶乘
            sum += ret;//阶乘的和
        }
        System.out.println(ret);
        System.out.println(sum);
    }
}

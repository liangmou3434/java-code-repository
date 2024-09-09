import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-03-19
 * Time: 19:42
 */
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("请输入x1的值：> ");
        int x1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("请输入x2的值：> ");
        int x2 = input2.nextInt();
        int x=0;
        if(x1 > x2){
            x=x1;
            System.out.println(x);
        }
        else if(x2 > x1){
            x=x2;
            System.out.println(x);
        }
    }
    public static void main2(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入y的值：> ");
        int y = input.nextInt();
        if(y<0||y>100){
            System.out.println("y不在0~100的范围内");
        }
        else{
            System.out.println("y在0~100的范围内");
        }
    }
    public static void main1(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入x的值：> ");
        int x = input.nextInt();
        if(x >= 0&&x <= 100){
            System.out.println("x在0~100的范围内");
        }
        else if(x < 0&&x > 100){
            System.out.println("x不在0~100的范围内");
        }

    }
}

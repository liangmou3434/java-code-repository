import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-16
 * Time: 9:13
 */
public class Test {
    public static void main3(String[] args) {
        //Random random = new Random(i) 输入i为一个固定的数值会生成一个固定的随机数
        //例：
        Random random = new Random(123);//生成随机数，每次生成随机数是根据当前的时间
        int n = random.nextInt(100+1);//随机数范围为1~100
        System.out.println(n);
    }

    public static void main2(String[] args) {
        //Random random = new Random(i) 输入i为一个固定的数值会生成一个固定的随机数
        //例：
        Random random = new Random();//生成随机数，每次生成随机数是根据当前的时间
        int n = random.nextInt(100+1);//随机数范围为1~100
        System.out.println(n);
    }
    public static void main1(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){//循环输入
            int age = input.nextInt();
            System.out.println("你的年龄是："+age);//结束循环ctrl+D
        }
    }
}

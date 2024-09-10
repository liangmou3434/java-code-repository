import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-16
 * Time: 13:24
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random input = new Random();//生成随机数
        int number = input.nextInt(100+1);
        while(true){
            System.out.println("请输入你猜想的数字： ");
            int number1 = scanner.nextInt();//输入猜想数字
            if(number1 > number){
                System.out.println("猜大了，再猜小一点");
            }else if(number1 < number){
                System.out.println("猜小了，猜大一点");
            }else{
                System.out.println("恭喜你猜对了，数字是"+number);
                break;//猜对了结束循环
            }
        }
    }
}

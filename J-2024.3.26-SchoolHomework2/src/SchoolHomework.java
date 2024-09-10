/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-03-26
 * Time: 19:32
 */
import java.util.Scanner;
import java.util.Random;
public class SchoolHomework {
    public static void main(String[] args) {
        int n = 10;
        Random r = new Random();//生成一个随机数
        int number = r.nextInt(1000+1);
        while(n!=0) {
            Scanner input = new Scanner(System.in);//输入猜想的数字
            System.out.println("请输入你猜想的数字： ");
            int number1 = input.nextInt();
            if( number1 < number ){
                System.out.println("太小了，再猜大一点！");
            }
            else if(number1>number){
                System.out.println("太大了，再小一点！");
            }
            else if(number1 == number){
                System.out.println("恭喜你猜对了！");
                System.out.println("该数字是"+number);
                break;
            }
            n--;
        }
    }
    public static void main1(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("请输入一个三位数： ");
         int number = input.nextInt();
        int number1 = number%10;//三位数的个位上的数字
        int number2 = number/10%10;//三位数十位的数字
        int number3 = number/100;//三位数百位的数字
        int n1 = number1*number1*number1;
        int n2 = number2*number2*number2;
        int n3 = number3*number3*number3;
        if(n1+n2+n3==number){
            System.out.println(number+"这个三位数是水仙花数 ");
        }
        else{
            System.out.println(number+"这个三位数不是水仙花数 ");
        }
    }
}

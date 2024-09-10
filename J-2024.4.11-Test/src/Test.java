import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-11
 * Time: 19:09
 */
public class Test {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int OddSum = 0;
        int EvenSum = 0;
        while(i <= 100){
            sum += i;//打印1~100的和
            if(i % 2 == 0){
                EvenSum += i;//偶数和
            }else{
                OddSum += i;//奇数和
            }
            i++;
        }
        System.out.println(sum+"是1~100的和");
        System.out.println(OddSum+"是1~100之间的奇数和");
        System.out.println(EvenSum+"是1~100之间的偶数和");
    }
    //打开main函数的两种方法 1.main+回车 2.psvm+回车
    public static void main1(String[] args) {
               int i = 0;//在java中循环条件必须用布尔表达式
           while(i <= 10){
                   System.out.println(i);
                   i++;//循环的步进
               }
    }
}

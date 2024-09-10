/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-02
 * Time: 18:41
 */
import java.util.Scanner;
public class Test {
    //九乘九乘法表
    public static void main1(String[] args) {
            for(int i = 1;i <= 9;i++){
                for(int j = 1;j <= 9;j++){
                    int result = j*i;
                    System.out.print(j+"x"+i+"="+result);
                    System.out.print(" ");
                }
                System.out.println();
            }

    }
}

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-03-26
 * Time: 18:48
 */
import  java.util.Scanner;
import java.util.StringTokenizer;

public class SchoolTest {
    public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             System.out.println("请输入一个年份： ");
             int year = input.nextInt();
             if(year%4 == 0&&year%100 != 0){
                 System.out.println(year+"年是闰年");
             }
             else if(year%400 == 0){
                 System.out.println(year+"年是闰年");
        }
             else{
                 System.out.println(year+"年不是闰年");
             }
    }
    public static void main4(String[] args) {
        System.out.println("我有以下功能： ");
        System.out.println("请选择你需要的服务 1.开户 2.存款 3.取款 4.转账 5.查询余额 6.修改密码 0.退出");
        System.out.println("请输入你选择的功能对应的数字 ");
        int number1 = 1;
        do{
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            switch(number){
                case 1:
                    System.out.println("开户");
                    break;
                case 2 :
                    System.out.println("存款");
                    break;
                case 3 :
                    System.out.println("取款");
                    break;
                case 4 :
                    System.out.println("转账");
                    break;
                case 5 :
                    System.out.println("查询账户");
                    break;
                case 6 :
                    System.out.println("修改密码");
                    break;
            }
            if(number==0){
                System.out.println("谢谢使用再见");
                number1++;
            }
        }while(number1 <= 10);

    }
    public static void main3(String[] args) {//直角三角形的打印
         for(int i = 1;i <= 5;i++){
             for(int j = 1;j<=i;j++) {
                 System.out.print("*");
             }
             System.out.println();
         }

    }
    public static void main2(String[] args) {
        //用循环实现代码
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            System.out.println("请输入第"+i+"名同学的分数");
            int score = input.nextInt();
            if(score < 0){
                System.out.println("输入的成绩不合法，请重新输入");
                break;
            }
            sum += score;
        }
        int result = 0;
        result = sum/5;
        System.out.println("这五个同学的平均分为 "+result);
    }
    public static void main1(String[] args) {
          Scanner input1 = new Scanner(System.in);
          System.out.println("请输入第一个同学的成绩： ");
          int number1 = input1.nextInt();
          Scanner input2 = new Scanner(System.in);
          System.out.println("请输入第二个同学的成绩： ");
          int number2 = input2.nextInt();
          Scanner input3 = new Scanner(System.in);
          System.out.println("请输入第三个同学的成绩： ");
          int number3 = input3.nextInt();
          Scanner input4 = new Scanner(System.in);
          System.out.println("请输入第四个同学的成绩： ");
          int number4 = input4.nextInt();
          Scanner input5 = new Scanner(System.in);
          System.out.println("请输入第五个同学的成绩： ");
          int number5 = input5.nextInt();
          int all = number1+number2+number3+number4+number5;
          int result = all/5;
        System.out.println("这五个同学的平均成绩为 "+result);
       // System.out.println("这五个同学的平均成绩为: ");
       // System.out.print(result);

    }
}

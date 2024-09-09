
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int number = 0;
        int result = 0;
        int result1 = 0;
        while(number<=100){
            if(number%2==0){
                result=result+number;
            }
            else{
                result1=result1+number;
            }
            number++;
        }
        System.out.println("result为偶数和");
        System.out.println(result);
        System.out.println("result1为偶数和");
        System.out.println(result1);
    }
    public static void main4(String[] args) {
        int number = 1;
        int result = 0;
        while (number <= 100) {
            result = result + number;
            number++;
        }
        System.out.println(result);
    }


    public static void main3(String[] args) {
        //100米赛跑，先预赛---成绩达到十秒以内，进决赛，否则淘汰
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的预赛成绩：（s)" );
        int time = input.nextInt();
        if(time <= 10){
            //有资格进决赛
            System.out.println("请输入您的性别：男/女 ");
            char gender = input.next().charAt(0);
            if(gender=='男'){
                System.out.println("恭喜您进入男子组");
            }
            else{
                System.out.println("恭喜您进入女子组");
            }
        }
        else{
            //没有资格进入决赛
            System.out.println("淘汰");
        }
    }
    public static void main2(String[] args) {
        Scanner input = new Scanner(System.in);//输入成绩函数
        System.out.print("请输入你的成绩：>");
        int score = input.nextInt();
        if(score>=90){
            System.out.println("你的成绩等级为A");
        }
        else if(score>=80&&score<90){
            System.out.println("你的成绩等级为B");
        }
        else if(score>=70&&score<80){
            System.out.println("你的成绩等级为C");
        }
        else if(score>=60&&score<70){
            System.out.println("你的成绩等级为D");
        }
        else if(score<60){
            System.out.println("你的成绩等级为E");
        }
    }

    public static void main1(String[] args) {
        //短路效应
        int a = 6,b = 10;
        System.out.println(a>5&&b++==10);//a=6>5为真 所以不再判断后面的表达式
        System.out.println(b);//前面的表达式虽然不判断 但是会执行 故b++ =10+1=11

        System.out.println(a>8&&b++==10);//a=6>8为假，故整个表达式为假不再判断后面的表达式不再执行
        System.out.println(b);//上面表达式 b=11 故b不变为11
    }
}

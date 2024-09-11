import java.util.Random;
import java.util.Scanner;

public class Test {//双色球号码 六个红色一个蓝色 红1~33 蓝1~16
    //需购买7个球 一个蓝色 六个红色
    public static void main(String[] args) {
    int[] array = CreateNumber();//接收中奖数组的号码
    }
    public static int[] Input(){//用户输入双色球号码
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);//输入双色球号码
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第"+(i + 1)+"个红球号码");
            int number = sc.nextInt();
            if(number >= 1 && number <=33){
              boolean flag = Contains(arr,number);//判断输入号码是否重复
                if(!flag){
                     arr[i] = number;//把输入的数字添加到数组中
                }else{
                    System.out.println("当前号码已经重复 请重新输入！");
                }
            }else{
                System.out.println("红球号码输入错误！ ");
            }
        }
        for (int i = 6; i < 7; i++) {
            System.out.print("请输入你的蓝球号码： ");
            int number = sc.nextInt();
            if(number >= 1 && number <= 16) {
                arr[i] = number;
            }else{
                System.out.println("你输入的号码错误，请重新输入！");
            }
        }
        return arr;
    }
    public static int[] CreateNumber(){//生成中奖号码
        Random r = new Random();
        int[] arr = new int[7];//用数组来储存中奖号码
        for (int i = 0; i < 6;) {
            int number = r.nextInt(33) + 1;//生成六个红球的中奖号码-且红球号码不能重复
            boolean flag = Contains(arr,number);//把红球的中奖号码放到数组的前六位
            if(!flag){
                arr[i] = number;
                i++;//执行赋值后才++ 否则循环不++
            }
        }
        for (int i = 6; i < 7; i++) {
            int number = r.nextInt(16) + 1;//生成一个蓝球的中奖号码
            arr[i] = number;//把蓝色球的中奖号码储存进数组里
        }
        for (int i = 0; i < 7; i++) {//打印中奖号码
            if(i < 6) {
                System.out.println("此次红球中奖的号码是：" + arr[i]);
            }else if(i == 6){
                System.out.println("此次蓝球中奖的号码是: "+arr[i]);
            }
        }
        return arr;//返回中奖号码的数组（
    }
    public static boolean Contains(int[] arr,int number){//用来判断中奖号码是否重复
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}

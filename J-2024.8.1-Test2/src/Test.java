import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        键盘录入一些1~100之间的整数，并添加到集合中
//                直到集合中所有数据和超过200为止

        //1.创建一个集合来放整数
        ArrayList<Integer> list = new ArrayList<>();

        //键盘输入整数
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("请输入一个整数:");
            String number = sc.nextLine();//nextLine输入的为字符串
            //把字符串转换成整型
            int num = Integer.parseInt(number);
            //先把异常数据筛除
            if(num < 0 || num > 100){
                System.out.println("当前数字不在1~100的范围内,请重新输入!");
                continue;
            }
            list.add(num);
           int sum = getSum(list);//对集合内的数据进行判断
            if(sum > 200){
                System.out.println("集合的数据已经超过200,数据总和为:" + sum);
                break;
            }
        }

    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

}

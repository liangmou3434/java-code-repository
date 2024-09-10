import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        String strings[] = {"string", "starting", "strong", "street", "stir", "studeng", "soft", "string"};
        int  number1 = 0;
        int number2= 0;

        // 遍历字符串列表
        for (String str : strings) {
            // 检查字符串是否以"st"开头
            if (str.startsWith("st")) {
                number1++;
            }
            // 检查字符串是否以"ng"结尾
            if (str.endsWith("ng")) {
                number2++;
            }
        }
        System.out.println("以st开头的字符串有"+number1+"个");
        System.out.println("以ng开头的字符串有"+number2+"个");
    }
    public static void main1(String[] args) {
        Scanner input = new Scanner(System.in);
       int[] array = new int[10];//定义一个数组但未初始化
        for (int i = 0; i < 10; i++) {
          array[i] = input.nextInt();//循环输入数组
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += array[i];//将数组的十个元素求和起来
        }
        int result = 0;
        result = sum / array.length;//求数组的平均数
        System.out.println("这十个数的平均数为： "+result);
    }
}

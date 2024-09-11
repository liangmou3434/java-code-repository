import java.util.Scanner;

public class Test {//评委打分 六个评委打分 去掉一个最高分去掉一个最低分 得出平均数
    public static void main(String[] args) {
        int[] arr = new int[6];//创建一个未初始化的数组从来存六个评委打的分数
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("输入第" + (i+1) + "位评委的分数: ");
            int score = scanner.nextInt();
            arr[i] = score;//把输入的分数放进数组里
        }
        //找出数组的最大值
       int max = Getmax(arr);
     //找出数组的最小值
        int min = Getmin(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int result = (sum - max - min) / 4;//总和减去最小值减去最大值除以4为最后四个评委的平均数
        System.out.println("这四位评委的平均数为: "+result);
    }
    public static int Getmax(int[] array){//得到数组中的最大值
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static int Getmin(int[] array){//得到数组中的最小值
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

}

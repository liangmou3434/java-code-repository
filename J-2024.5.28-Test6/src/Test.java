import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //把输入的六位评委打的分数放进一个数组里
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);//输入四评委打的分
        for (int i = 1; i <= 6; i++) {//输入6个评委的分数
            System.out.print("请输入第" + i + "位评委打的分数: ");
            int score = scanner.nextInt();
            if(score >= 0 && score <= 100) {
                arr[i - 1] = score;//把输入的分数存进数组里
            }else{
                score = 0;
                System.out.println("输入了错误的分数");
            }
        }
        //将乱序的数组排成升序
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        //去掉最大值和最小值求平均数 去掉第一个和最后一个班
        int sum = 0;
        for (int i = 1; i < 5; i++) {
            sum += arr[i];
        }
        int average = sum / 4;
        System.out.println("去掉最大值和最小值后");
        System.out.println("这四个评委打分的平均数为: "+average);
    }
    public static void main1(String[] args) {//把一个数组的元素放到一个新数组上去
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}

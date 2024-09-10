import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Printarr(arr);
        int max = Judgment(arr);
        System.out.println("这个数组内的最大值为: " + max);
        boolean result = contain(arr);
        System.out.println(result);
    }
    //在数组内查找一个数//
    public static boolean contain(int[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个你要查找的数字: ");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(number == array[i]){
                System.out.println("你查找的数"+number+"存在");
                return true;
            }
        }
        return false;
    }
    //写一个方法 返回数组的最大值
    public static int Judgment(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static void Printarr(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");//用于遍历数组
        }
        System.out.println();
    }
}

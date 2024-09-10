import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-05-07
 * Time: 15:18
 */
public class Test {
    public static void main(String[] args) {//输出二维数组的方式-》 使用两个for循环
        int[][] array = {{1,2,3},{4,5,6}};
        for (int i = 0; i <array.length ; i++) {//array.length为二维数组的行数
            for (int j = 0; j < array[i].length; j++) {//array[i].length为i行中的列数
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        //使用两个foreach
        for (int[] arr:array) {//先用一维数组接收每一行
            for (int x:arr) {//再用foreach打印每一个一维数组（每一行）
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main1(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};//初始化一个二维数组
        System.out.println(Arrays.toString(array[0]));//打印数组的第一行
        System.out.println(Arrays.toString(array[1]));//打印数组的第二行
    }
}

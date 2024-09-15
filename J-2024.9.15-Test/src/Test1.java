import javax.crypto.spec.PSource;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //int[] tempAr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //要求：打乱一维数组中的数据，并按照4个一组的方式添加到二维数组中。
        //遍历数组,得到每一个元素,拿着每一个元素跟随机索引上的数据进行交换
        int[] tempAr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        for (int i = 0; i < tempAr.length; i++) {
            int number = r.nextInt(15 + 1);
            int temp = tempAr[i];
            tempAr[i] = tempAr[number];
            tempAr[number] = temp;//交换元素
        }

        for (int i = 0; i < tempAr.length; i++) {
            System.out.print(tempAr[i] + " ");
        }//检验数组是否打乱成功
//
        System.out.println();
        int[][] data = new int[4][4];
        int index = 0;
        //把打乱的一维数组放进二维数组里
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                data[i][j] = tempAr[index];
                index++;
            }
        }

        //检验一维是否放进二维数组内
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

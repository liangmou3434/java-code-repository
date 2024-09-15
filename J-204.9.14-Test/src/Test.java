import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //int[] tempAr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //要求：打乱一维数组中的数据，并按照4个一组的方式添加到二维数组中。
        //同时生成两个1~15下标的随机数,两个随机数作为下标交换元素
        int[] tempAr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r1 = new Random();
        for (int i = 0; i < 5; i++) {//交换五次(
            int number1 = r1.nextInt(15 + 1);
            int number2 = r1.nextInt(15 + 1);//生成两个随机数
            if(number1 == number2){
                continue;
            }
            int temp = tempAr[number1];
            tempAr[number1] = tempAr[number2];
            tempAr[number2] = temp;//交换两个元素
        }

        for (int i = 0; i < tempAr.length; i++) {
            System.out.print(tempAr[i] + " ");
        }//验证数组内交换是否成功
        
        //将一维数组按照4个一组的方式添加到而且数组中
        int index = 0;
        int[][] tempBr = new int[4][4];//四行四列的二维数组
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tempBr[i][j] = tempAr[index];
                index++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(tempBr[i][j] + " ");
            }
        }//验证放置是否成功
    }
}

import java.util.Random;


public class Test {
    public static void main(String[] args) {//生成十个随机数 求和 求数据的平均数 求数组中有多少个数据比平均值小
     int[] array = new int[10];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int number = r.nextInt(100+1);
            array[i] = number;//把生成的随机数放进数组内
        }
        //打印数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //求和/
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("这个数组的所有元素和为: "+sum);
        int average = 0;
        average = sum / 10;
        System.out.println("这个数组的平均数为: "+average);
        System.out.print("数组中小于平均数的元素有: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i] < average){
                System.out.print(array[i]+" ");
            }
        }
    }
    public static void main2(String[] args) {//找最大值
        int[] arr = {33,5,22,83,52};
        int tmp = arr[0];//用来装最大值
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > tmp){
               tmp = arr[i];
           }
        }
        System.out.println("这个数组中最大的值为: "+tmp);
    }
    public static void main1(String[] args) {//数组的动态初始化
        //定义一个字符串数组用来储存50个学生的名字 名字位置
        String[] arr1 = new String[50];
        arr1[0] = "zhangsan";
        arr1[1] = "lisi";
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);//未初始化值为null
    }

}

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        public static String toString（数组)                        把数组拼接成一个字符串
//        public static int binarySearch(数组，查找的元素)              二分查找法查找元素
//        public static int[]copyof（原数组，新数组长度）                拷贝数组
//        public staticint[] copyofRange（原数组，起始索引，结束索引）     拷贝数组(指定范围)
//        public static void fill（数组，元素）                         填充数组
//        public static void sort(数组)                               按照默认方式进行数组排序

        //1.将数组拼接成一个字符串
        System.out.println("-------------------------------");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //2.二分查找法查找元素-返回查找元素的下标,如果没有则返回负数
        //二分查找的前提:数组是有序的,binarySearch方法要求数组必须是升序的
        //如果查找的元素存在,返回的是真实的索引,如果查找的元素不存在,则返回-插入点-1(-10-1=-11)
        System.out.println("-------------------------------");
        System.out.println(Arrays.binarySearch(arr,10));//9
        System.out.println(Arrays.binarySearch(arr,2));//1
        System.out.println(Arrays.binarySearch(arr,20));//-11

        //3.拷贝数组
        //方法底层会根据第二个参数来创建新的数组
        //如果新数组的长度小于老数组长度,会部分拷贝
        //如果新数组的长度等于来数组的长度,会完全拷贝
        //如果新数组的长度大于老数组的长度,会补上默认值
        System.out.println("-------------------------------");
        int[] newArr1 = Arrays.copyOf(arr,20);
        System.out.println(Arrays.toString(newArr1));
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

         //4.拷贝数组(指定范围)
        System.out.println("-------------------------------");
        int[] newArr2 = Arrays.copyOfRange(arr,0,9);//把arr0~9下标的元素拷贝过来-包头不包尾
        System.out.println(Arrays.toString(newArr2));//[1, 2, 3, 4, 5, 6, 7, 8, 9]

        //5.填充数组-数组内所有元素替换成100,原来的数据会被覆盖
        System.out.println("-------------------------------");
        Arrays.fill(arr,100);
        System.out.println(Arrays.toString(arr));//[100, 100, 100, 100, 100, 100, 100, 100, 100, 100]

        //6.默认情况下,给基本数据类型进行升序排列
        System.out.println("-------------------------------");
        int[] arr2 = {10,2,3,5,6,1,7,8,4,9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}

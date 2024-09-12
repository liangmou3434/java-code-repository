import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
//        quickSort(arr, 0, arr.length - 1);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        Random r = new Random();
        int[] arr = new int[10];//创建随机数组来测试
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100 + 1);//创建10个随机数,把随机数放进数组里
        }
        //打印排序前的数组
        System.out.print("排序前的数组:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr,0,arr.length - 1);//对数组进行快速排序

        System.out.print("排序后的数组:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        if (i >= j) {
            return; // 递归结束
        }

        int baseNumber = arr[i];
        int start = i;
        int end = j;

        while (start < end) {
            while (start < end && arr[end] >= baseNumber) {
                end--;
            }
            while (start < end && arr[start] <= baseNumber) {
                start++;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }

        swap(arr, i, start); // 将基准元素放回正确位置

        quickSort(arr, i, start - 1); // 排序左边
        quickSort(arr, start + 1, j); // 排序右边
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
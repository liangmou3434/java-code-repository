public class Test2 {
    public static void main(String[] args) {//选择排序
        int[] arr={5,3,2,1,4};
        //外循环:几轮
        for (int i = 0; i < arr.length; i++) {
            //内循环,拿着i和i后面的数据进行比较和交换
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
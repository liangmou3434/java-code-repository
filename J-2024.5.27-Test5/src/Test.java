public class Test {
    public static void main(String[] args) {//把大数组array其中间的一段拷贝给另外一个数组
        int[] array = {1,2,3,4,5,6,7,8,9,10};
       int[] arr2 = Copy(array,2,6);//接收返回的数组
    }
    public static int[] Copy(int[] arr,int x,int y){//返回数组的写法
        int number = 0;
        int[] arr1 = new int[y-x];
        for (int i = x; i < y; i++) {
            arr1[number] = arr[i];
            number++;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        return arr;//返回一个数组
    }
}

public class Test {
    public static void main(String[] args) {//冒泡排序
        int[] arr={5,3,2,1,4};
        //外循环,表示要执行多少轮,如果有n个数据,则执行n-1轮
        for (int i = 0; i < arr.length; i++) {
            //内循环:每一轮中比较数据找到当前的最大值
            //-1 为了防止索引越界
            //-i 为了体改效率,每一轮执行的次数应该比上一轮少一次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {//遍历数组,看冒泡排序是否成功
            System.out.print(arr[i] + " ");//1 2 3 4 5
        }
    }
}
public class Test3 {
    public static void main(String[] args) {
//        插入排序：
//        将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
//        遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。

        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        //1.找到无序的那一组数组是从哪个索引开始的
        //思路:如果前一个数据大于后一个数据,则该后一个数据就是无序数组的开始
        //例:44>38 则38就是无序数组的开始 44就是有序数组的结束
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i + 1]){
//                System.out.println(i + 1);//2 表示有序数组到1索引就结束了 i + 1为无序数组的开始索引
                startIndex = i + 1;
                break;
            }
        }

        //把无序数组的数据插入到有序数组中
        //遍历从startIndex开始到最后一个元素,依次得到无序的那一个数组中的每个元素
        for (int i = startIndex; i < arr.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                if(arr[j] > arr[i]){//arr[j]为有序数组的数据 arr[i]为无序数组的数据
                    //若arr[j]>arr[i] 则为后面的数据大于前面的数据 需要交换位置
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
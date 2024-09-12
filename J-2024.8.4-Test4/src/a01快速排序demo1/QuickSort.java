package a01快速排序demo1;
public class QuickSort {
    public static void main(String[] args) {
//        快速排序：
//        第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
//        比基准数小的全部在左边，比基准数大的全部在右边。
//        后面以此类推
        int[] arr={6,1,2,7,9,3,4,5,10,8};
        quickSort(arr,0,arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //参数一:我们要排序的数组
    //参数二:要排序的数组的起始索引
    //参数三,要排序数组的结束索引
    public static void quickSort(int[] arr,int i,int j){
      int start = i;//记录数组的起始位置
      int end = j;
      int baseNumber = arr[i];
      if(start >= end){
          return;//递归结束
      }
      while(start != end){
          //用end ,从后开始往前找比基准数小的数字
          while(true){
              if(end <= start || arr[end] < baseNumber){
                  break;
              }
              end--;
          }
          //用start,从前开始往后找比基准数大的数字
          while(true){
              if(end <= start || arr[start] > baseNumber){//找到值后结束循环,并挪动start指向的位置
                  break;
              }
              start++;
          }
          //把end和start元素进行交换
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
      }
      //基准数归位,将start下标的和基准数交换位置
       int temp = arr[start];
       arr[start] = arr[i];
       arr[i] = temp;
//        int temp = arr[start];
//        arr[start] = baseNumber;
//        baseNumber = temp;
        //虽然arr[i]=baseNumber 此处改变的事baseNumber的值,并没有改变数组中的基准值,所以要用arr[i]来实现交换
        quickSort(arr,i,start - 1);
        quickSort(arr,start + 1 ,j);
       }
    }


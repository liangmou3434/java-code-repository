package a02斐波那契数列;

public class Test {
    public static void main(String[] args) {//求第十二个斐波那契数
        //1 1 2 3 5 8 13
        //1:求解1
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //求解二
        int number = 12;//利用递归的方式求斐波那契数
        System.out.println(getSum(number));
    }

    public static int getSum(int number){
     if(number <= 2){
         return 1;
     }else{
         return getSum(number - 1) + getSum(number - 2);
     }
    }
}

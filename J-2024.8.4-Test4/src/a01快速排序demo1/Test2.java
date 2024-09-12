package a01快速排序demo1;

public class Test2 {
    public static void main(String[] args) {
        //求n的阶乘
        System.out.println(getSum(5));
    }
    public static int getSum(int number){
        if(number == 1){
            return 1;
        }
        return number * getSum(number - 1);
    }
}

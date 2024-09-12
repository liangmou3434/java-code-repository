package a01快速排序demo1;

public class Test {
    public static void main(String[] args) {
        //使用递归求1~100之间的和
        System.out.println(getSum(100));
    }
    public static int getSum(int number){
        if(number == 1){
            return 1;
        }
        return number + getSum(number - 1);
    }
}
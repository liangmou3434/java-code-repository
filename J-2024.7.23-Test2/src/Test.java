public class Test {
    public static void main(String[] args) {
        //判断一个数是否是质数优化版
        //判断一个数是否是质数优化版思路:如果数是合数,那么合数的公因子会有一个大于开合数的平方根,一个小于合数的平方根
        //例:16 2x8 = 16 16的平方根是4 2小于平方根,8大于平方根,所以只需要判断数据平方根的左边是否有它的公因子就能判断这个数是否是质数
        System.out.println(isPrime(13));//true 返回true为质数
        System.out.println(isPrime(20));//false 返回flase为合数
    }

    public static boolean isPrime(int number){//返回真为质数,返回假为合数
        for (int i = 2; i <= Math.sqrt(number); i++) {
         if(number % i == 0){
             return false;
          }
        }
        return true;
    }
}

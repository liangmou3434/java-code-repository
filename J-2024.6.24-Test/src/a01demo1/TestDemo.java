package a01demo1;

public class TestDemo {
    public static void main(String[] args) {
   //测试工具类的两个方法是否正确
        int[] arr1 = {1,2,3};
        double[] arr2 = {1.0,2.0,3.0};//调用工具类的方法时 用类名.方法名调用
        String str =  ArrayUtil.printArr(arr1);
        double result = ArrayUtil.getAerage(arr2);
        System.out.println(str);
        System.out.println(result);
    }
}

import java.util.Scanner;

public class Test {//把一个整型数组拆成字符串并拼接 输出结果为[1,2,3]
    //键盘输入一个字符串 调用方法在控制台上逆序输出字符串 如“abc” 打印“cba”

    public static void main(String[] args) {
        toString1();
    }
    public static void toString1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串： ");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(str.length() - i - 1);
            System.out.print(c+" ");
        }
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3};
        String c = toString(arr);
        System.out.println(c);
    }
    public static String toString(int[] arr){//将整型数组转换成字符串
        if(arr == null){//数组为空数组
            return "";
        }
        if(arr.length == 0){//数组长度为0
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {//把数据变成字符串进行拼接
            if(i == arr.length - 1) {
                result =result + arr[i];
            }else{
                result = result + arr[i] + ",";
            }
        }
        result = result + "]";
        return result;
    }
}

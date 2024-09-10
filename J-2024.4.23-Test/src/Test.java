import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-23
 * Time: 18:50
 */
public class Test {
    public static void func1(int[] array,char[]array1){

        int[] tmp = new int[10];//使用为初始化的数组
        int len1 = tmp.length;
        System.out.println("请输入你的账号： ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < len1; i++) {//利用for循环输入数组
           tmp[i] = scanner.nextInt();
        }
        for(int j = 0;j < len1;j++){
            if(array[j] == tmp[j]) {
                continue;
            } else{
                System.out.println("你的账号输入错误!");
                break;
            }
        }
        System.out.println("请输入你的密码： ");
        char[] tmp1 = new char[8];
        int len2 = tmp1.length;
        for(int n = 0;n < len2;n++){
            tmp1[n] = scanner.next().charAt(0);
        }
        for (int i = 0; i < len2; i++) {
            if(array1[i] == tmp1[i]){
                continue;
            }else{
                System.out.println("你的密码输入错误！");
                break;
            }
        }
        System.out.println("恭喜你！登录成功！! !");
    }
    public static void func2(int[] array){
        char[] tmp1 = new char[8];
        int len2 = tmp1.length;
        Scanner scanner = new Scanner(System.in);
        for(int n = 0;n < len2;n++){
            tmp1[n] = scanner.next().charAt(0);
        }
        System.out.println("注册成功！");
        int[] tmp = array;
        System.out.println("你的账号是： ");
        for (int x:tmp) {
            System.out.print(x);
        }
    }
    public static void func3(int[] array,char[]array1){
        int[] tmp = array;
        char[] tmp1 = array1;
        System.out.println("账号是：");
        for (int x:array) {
            System.out.print( x +" ");
        }
        System.out.println();
        System.out.println("密码是：");
        for (char i:array1) {
            System.out.print(i +" ");
        }
    }
    public static void main(String[] args) {
        int[] array = {2,6,8,5,4,6,3,6,3,6};
        char [] array1 ={'G','Z','N','F','X','Y','1','3'};
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("3.查看");
        System.out.println("4.退出");
        System.out.println("请输入你要选择进入的功能： ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number) {
            case 1:
                func1(array,array1);
                break;
            case 2:
                func2(array);
                break;
            case 3:
                func3(array,array1);
                break;
            case 4:
                System.out.println("你已经退出！");

        }
    }
}

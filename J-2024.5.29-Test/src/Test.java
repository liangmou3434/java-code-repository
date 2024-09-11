import java.util.Scanner;

public class Test {//数字加密和解密 先+5 再%10 再反转
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];//创建数组，把密码放进数组内
        for (int i = 0; i < 4; i++) {//输入四位密码
            System.out.print("输入你的四位密码： ");
            int password = scanner.nextInt();
            arr[i] = password;//把四位密码存进数组内
        }
        arr = Add(arr);
        arr = Division(arr);
        arr = Contrary(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("你得到是四位新密码是： "+arr[i]);
        }
    }
    public static int[] Add(int[] array){//用来加5
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 5;
        }
        return array;
    }
    public static int[] Division(int[] array){//用来%10
        for (int i = 0; i < array.length; i++) {
            array[i]  = array[i] % 10;
        }
        return array;
    }
    public static int[] Contrary(int[] array){//用来将密码反转
        for (int i = 0; i < (array.length / 2); i++) {
            int tmp = array[i];
            array[i]  = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}

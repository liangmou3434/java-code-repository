import java.util.Scanner;

public class Test {//逢七过 数字里有7或是7的倍数为过//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字: ");
        int number = input.nextInt();
        for (int i = number; i < 100; i++) {
            if(i % 10 == 7 || i / 10 == 7 || i % 7 == 0){
                System.out.print("过"+" ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}

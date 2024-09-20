import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //编写程序,计算一元二次方程的根
        System.out.println("请输入一元二次方程 a*x*x + bx + c 中的 a,b,c:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //初始化判别式
        double Discriminant = b * b - 4 * a * c;
        if(Discriminant > 0){
            //给判别式开平方
            double Discriminantroot = Math.sqrt(Discriminant);
            double root1 = (-b + Discriminantroot) / 2 * a;//第一个根
            double root2 = (-b - Discriminantroot) / 2 * a;//第二个根
            System.out.println("一元二次方程的两个解分别是:root1 = "+root1 + " root2 = " + root2);
        }else if(Discriminant == 0){//判别式为0,只有一个解
            double root = -b / 2 * a;
            System.out.println("一元二次方程只有一个解,这个解是:root = " + root);
        }else{
            System.out.println("这个一元二次方程无解!");
        }
    }
}

import java.util.Scanner;

public class Test {//买机票
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入
        System.out.print("请输入机票原价: ");
        int money = scanner.nextInt();//输入机票原价
        System.out.print("请输入月份: ");
        int month = scanner.nextInt();//输入月份
        System.out.print("输入你的舱类: 1.头等舱 2.经济舱");
        int cabin = scanner.nextInt();
       int discount = 0;//折后价
        while (cabin != 0) {
            if (cabin == 1) {//头等舱
                if (month >= 5 && month <= 9) {
                    discount = (int)(0.9 * money);
                } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
                    discount = (int)(0.7 *money );
                } else {
                    System.out.println("输入的月份错误,请重新输入");
                }
                System.out.println("头等舱在" + month + "月的折后价为" + discount);
                break;
            } else if (cabin == 2) {//经济舱
                if (month >= 5 && month <= 9) {
                    discount = (int)(0.85 * money);
                } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
                    discount = (int)(0.65 * money);
                } else {
                    System.out.println("输入的月份错误,请重新输入");
                }
                System.out.println("经济舱在" + month + "月的折后价为" + discount);
                break;
            } else {
                System.out.println("没有这个舱位,请重新输入!");
            }
        }
    }
}

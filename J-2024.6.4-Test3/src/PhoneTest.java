import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建数组储存三部手机
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("小米",5999.0,"白");
        Phone p2 = new Phone("华为",6899.0,"黄");
        Phone p3 = new Phone("三星",2888.0,"红");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrize();
        }
        double ret = sum / arr.length;
        System.out.println("三部手机的平均价格为："+ret);
        //输入手机的品牌 价格和颜色
//        for (int i = 0; i < arr.length; i++) {
//            Phone phone = new Phone();//创建一个空对象
//            System.out.print("请输入手机的品牌： ");
//            String brand = sc.next();
//            phone.setBrand(brand);
//            System.out.print("请输入手机的价格： ");
//            double prize = sc.nextDouble();
//            phone.setPrize(prize);
//            System.out.print("请输入手机的颜色：");
//            String color = sc.next();
//            phone.setColor(color);
//            arr[i] = phone;//把赋值好后的对象放进数组里
//        }

    }
}

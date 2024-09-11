import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];//创建一个数组用来储存三个汽车对象
        //键盘录入
        //nextInt();-接收整数
        //nextDouble();-接收小数
        //next();-接收字符串
        //以上字符遇到空格 制表符 回车就停止接收 符号后面的数据不会接受 但会延伸给下一次键盘录入

        //nextLint();-接收字符串 可以接收空格和制表符 遇到回车才停止接收数据
        Scanner sc = new Scanner(System.in);//键盘输入
        //创建三个汽车对象

        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.print("请输入汽车的品牌： ");
            String brand = sc.next();
            c.setBran(brand);//赋值品牌
            System.out.print("请输入汽车的价格： ");
            double prize = sc.nextDouble();
            c.setPrize(prize);//赋值价格
            System.out.print("请输入汽车的颜色： ");
            String color = sc.next();
            c.setColor(color);//赋值颜色
            //把汽车对象添加到数组中
            arr[i] = c;
        }
        //遍历数组 打印汽车的信息
        for (int i = 0; i < arr.length; i++) {
          Car car = arr[i];
            System.out.println("汽车的品牌是："+car.getBrand()+"价格是："+car.getPrize()+"颜色是"+car.getColor());
        }
    }
}

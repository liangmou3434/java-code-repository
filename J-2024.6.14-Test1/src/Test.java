import java.util.Scanner;

public class Test {
    public static void main(String[] args) {//输入一个金额将金额转成中文
        int money;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入一个金额: ");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("输入的金额错误,请重新输入!");
            }
        }
        String moneystr = "";//定义一个字符串用来接收钱的中文
        int count = 0;
        while(true){//得到金额的每个数字
            int singleNumber = money % 10;
            String s = Replace(singleNumber);
            moneystr = s + moneystr;
            money /= 10;//去掉已获取的数字为得到下一位数字
            count++;//每去掉一为数字就++
            if(money == 0){
                break;//如果money为0 则全部数据已经获取 结束循环
            }
        }
        for (int i = 0; i < 7 - count; i++) {
            moneystr = "零" + moneystr;
        }
        //插入单位
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneystr.length(); i++) {
            char c = moneystr.charAt(i);
            System.out.print(c + arr[i]);
        }
    }
    public  static String Replace(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];//把对应下标的中文汉字返回去
    }
}

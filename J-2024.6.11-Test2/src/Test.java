import java.util.Scanner;

public class Test {//模拟用户登录

    public static void main(String[] args) {
        String userName = "liangmou3434";//正确的用户名
        String userPassword = "1234567";//正确的密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名： ");
            String name = sc.next();
            System.out.println("请输入用户密码： ");
            String password = sc.next();
            if (userName.equals(name) && userPassword.equals(password)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if(i == 2){
                    System.out.println("你的账号用户名为"+userName+"已经被锁定");
                }else {
                    System.out.println("用户或密码输入错误，请重新输入！！！你还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }

    public static void main1(String[] args) {
        String userName = "liangmou3434";//正确的用户名
        String userPassword = "1234567";//正确的密码
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while(count != 0) {
            System.out.println("请输入用户名： ");
            String name = sc.next();
            boolean nameResult = userName.equals(name);
            if (nameResult != true) {
                System.out.println("用户名输入错误，请重新输入！");
            } else {
                System.out.println("请输入用户密码： ");
                String password = sc.next();
                boolean passwordResult = userPassword.equals(password);
                if (passwordResult != true) {
                    System.out.println("密码输入错误，请重新输入");
                } else {
                    System.out.println("登录成功！");
                    break;
                }
            }
            count--;
        }
    }
}

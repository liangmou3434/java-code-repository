import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list1 = new ArrayList<>();//创建一个新的集合来放置用户的信息
        while(true){
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作: 1.登录 2.注册 3.忘记密码 0.退出");
            int choose = sc.nextInt();
            switch(choose){
                case 1:login(list1);
                    break;
                case 2:Register(list1);
                    break;
                case 3:ForGetPassword(list1);
                    break;
                case 0 : {
                    System.out.println("你已经退出登录界面!!谢谢使用,再见!");
                    System.exit(0);//结束外循环
                }
                default:
                    System.out.println("你输入了错误的数字请重新输入!!!");
                    break;
            }
        }
    }
    public static void login(ArrayList<User> list1){//登录
    }
    public static void Register(ArrayList<User> list1){//注册
        Scanner sc = new Scanner(System.in);
        User u = new User();//创建一个新的用户对象
        //用户名,密码,身份证号码,手机号码赋值给对象
        //再把对象添加集合里
        while(true){//判断用户名是否合理
            System.out.println("请输入用户名: ");
            String username = sc.next();
            //用户名唯一,用户名的长度为3~15 用户名不能是纯数字,但可以是纯字母,要数字和字母相结合
            //先判断用户名是否合理,再判断是否唯一
            if((JudgmentUserName(username) == true) && (Contain(username,list1) == true) ){
                return;
            }else{
                System.out.println("输入的用户名格式错误或用户名已经存在!请重新输入!");
            }
        }
        //键盘输入两次密码,两次密码一致才可以注册

    }
    public static boolean
    public static boolean Contain(String username,ArrayList<User> list1){//判断用户名是否唯一
        for (int i = 0; i < list1.size(); i++) {
            User u = list1.get(i);
            if(username.equals(u.getUserName())){
                return false;
            }
        }
        return true;//循环结束,用户名没有重复,返回true
    }
    public static boolean JudgmentUserName(String username){//判断用户名是否合理
        int count = 0;
        int leng = username.length();
        if( leng < 3 || leng > 15){
            return false;
        }
        for (int i = 0; i < leng; i++) {
            char c = username.charAt(i);
            if(!((c >= '0' && c <= '9')|| (c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z'))){
                //用户名中有除数字和字母之外的字符
                return false;
            }
            if((c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z')){//判断用户名的大小写字母有多少
                count++;
                break;//一旦用户名中有字母,则用户名就不为纯数字,结束循环并返回ture
            }
        }
        return count > 0;//count = 0 用户名中全是数字,返回false
        //用户名中不能是纯数字
    }
    public static void ForGetPassword(ArrayList<User> list1){//忘记密码
    }

}

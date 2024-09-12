import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list1 = new ArrayList<>();//创建一个新的集合来放置用户的信息
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作: 1.登录 2.注册 3.忘记密码 0.退出");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    login(list1);
                    break;
                case 2:
                    Register(list1);
                    break;
                case 3:
                    ForGetPassword(list1);
                    break;
                case 0: {
                    System.out.println("你已经退出登录界面!!谢谢使用,再见!");
                    System.exit(0);//结束外循环
                }
                default:
                    System.out.println("你输入了错误的数字请重新输入!!!");
                    break;
            }
        }
    }

    public static void login(ArrayList<User> list1) {//登录
        Scanner sc = new Scanner(System.in);
        while(true) {
            String str = getCode();
            System.out.println(str);
            System.out.println("请输入验证码: ");
            String str1 = sc.next();
            if (str.equalsIgnoreCase(str1)) {//输入验证码大小写无论
                break;
            } else {
                System.out.println("验证码错误,请重新输入!");
            }
        }
        int count = 3;
        while(count != 0) {
            System.out.println("请输入你的用户名: ");
            String username = sc.next();
            boolean result = false;
            for (int i = 0; i < list1.size(); i++) {
                User user = list1.get(i);
                if (username.equals(user.getUserName())) {
                    result = true;
                    break;
                }
            }
            if (result == false) {
                System.out.println("用户不存在,请先注册!!");
                return;//用户不存在直接结束方法
            }
            boolean ret = false;
            System.out.println("请输入你的密码: ");
            String password = sc.next();
            for (int i = 0; i < list1.size(); i++) {
                User user = list1.get(i);
                if (password.equals(user.getPassword())) {
                    ret = true;
                    System.out.println("登录成功!欢迎使用学生管理系统!");
                    StudentTest st = new StudentTest();//创建一个新的对象
                    st.startStudentSystem();//启动学生管理系统
                    System.exit(0);//退出大循环
                }
            }
            if(result == false){
                System.out.println("你输入的密码错误!!!");
                System.out.println("你还有"+count+"次登录的机会");
            }
        }

    }

    public static void Register(ArrayList<User> list1)  {
        Scanner sc = new Scanner(System.in);
        //用户名,密码,身份证号码,手机号码赋值给对象
        //再把对象添加集合里
        String username;
        while(true){//判断用户名是否合理
            System.out.println("请输入用户名: ");
            username = sc.next();
            //用户名唯一,用户名的长度为3~15 用户名不能是纯数字,但可以是纯字母,要数字和字母相结合
            //先判断用户名是否合理,再判断是否唯一
            if((JudgmentUserName(username) == true) && (Contain(username,list1) == true) ){
                break;
            }else{
                System.out.println("输入的用户名格式错误或用户名已经存在!请重新输入!");
            }
        }
        //输入两次密码 两次密码不能相同
        String password;
        while(true){
            System.out.println("请输入你的密码: ");
            password = sc.next();
            System.out.println("请再次输入你的密码: ");
            String password1 = sc.next();
            if(!(password.equals(password1))){
                System.out.println("你输入的两次密码不一致,请重新输入!");
                continue;
            }else{
                break;
            }
        }
        //身份证号码 长度为18 第一位不能是0 前十七位是数字 最后一位是数字或者大写X或小写x
        String idcarnumber;
        while(true){
            System.out.println("请输入你的身份证号码: ");
            idcarnumber = sc.next();
            boolean result = JudgmentIdCarNumber(idcarnumber);
            if(result == false){
                System.out.println("你输入的身份证格式错误,请重新输入!");
                continue;
            }else{
                break;
            }
        }
        //手机号码 必须是11位 开头不能是0 必须全是数字
        String phonenumber;
        while(true){
            System.out.println("请输入你的手机号码: ");
            phonenumber = sc.next();
            if( (JudgmentPhoneNumber(phonenumber)) == false){
                System.out.println("你输入的手机号码格式错误,请重新输入!");
                continue;
            }else{
                break;
            }
        }

        User u = new User(username,password,idcarnumber,phonenumber);//创建一个新的用户对象
        list1.add(u);//把用户添加进集合里
        System.out.println("注册成功");
        PrintList(list1);//遍历数组的信息看是否注册成功!
    }
    public static void ForGetPassword(ArrayList<User> list1) {//忘记密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的用户名: ");
        String username = sc.next();
        if(list1.size() == 0){
            System.out.println("用户不存在,请先注册!!");
        }
        int index = Judgment1(username,list1);
        User u = list1.get(index);
        if ( index == -1) {
            System.out.println("用户不存在,请先注册!!");
            return;//用户不存在直接结束方法
        }
        while (true) {
            System.out.println("请输入的身份证号码: ");
            String idcarnumber = sc.next();
            if (idcarnumber.equals(u.getIdCarNumber())) {
                break;
            } else {
                System.out.println("你输入的身份证号码错误,请重新输入!");
            }
        }
        while(true) {
            System.out.println("请输入的手机号码: ");
            String phonenumber = sc.next();
                if (phonenumber.equals(u.getPhoneNumber())) {
                    break;
                } else {
                    System.out.println("你输入的手机号码错误,请重新输入!");
                }
        }
        while(true) {
            System.out.println("请输入你的新密码: ");
            String newpassword = sc.next();
            System.out.println("请再次输入你的新密码: ");
            String newpassword1 = sc.next();
            if(!(newpassword.equals(newpassword1))){
                System.out.println("输入两次密码不一致,请重新输入!");
                continue;
            }
            if(newpassword.equals(u.getPassword())){
                System.out.println("旧密码和新密码一致,请重新输入!");
            }else{
                u.setPassword(newpassword);//更改密码
                System.out.println("密码更改成功!!!");
                break;
            }
        }

    }
    public static void PrintList(ArrayList<User> list1){//打印集合里的用户信息
        for (int i = 0; i < list1.size(); i++) {
            User user = list1.get(i);
            System.out.println("你的用户名为: "+user.getUserName()+" 用户密码: "+user.getPassword()+" 身份证号"
                    +user.getIdCarNumber()+" 手机号码为: "+user.getPhoneNumber());
        }
    }
    public static boolean  JudgmentPhoneNumber(String phonenumber){//判断手机号码是否合理
        int leng = phonenumber.length();
        if(leng != 11){
            return false;
        }
        if(phonenumber.charAt(0) == '0'){
            return false;
        }
        for (int i = 0; i < leng; i++) {
            char c = phonenumber.charAt(i);
            if(c <= '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
    public static boolean  JudgmentIdCarNumber(String idcarnumber){//判断身份证号码是否合理
     int leng = idcarnumber.length();
      if(leng != 18){
         return false;
      }
//        if(idcarnumber.charAt(0) == '0'){
//            return false;
//        }
       if( idcarnumber.startsWith("0") == true){//判断字符串是否以0开头,返回布尔类型
       // 结果为真,则说明该字符串是以0开头
           return false;
       }
        for (int i = 1; i < leng - 1; i++) {
            char c = idcarnumber.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        char end = idcarnumber.charAt(leng - 1);
        if(!((end > '0' && end < '9') || end == 'X' || end == 'x')){
           return false;
        }
        return true;
    }

    public static boolean Contain(String username, ArrayList<User> list1) {//判断用户名是否唯一
        for (int i = 0; i < list1.size(); i++) {
            User u = list1.get(i);
            if (username.equals(u.getUserName())) {
                return false;
            }
        }
        return true;//循环结束,用户名没有重复,返回true
    }

    public static boolean JudgmentUserName(String username) {//判断用户名是否合理
        int count = 0;
        int leng = username.length();
        if (leng < 3 || leng > 15) {
            return false;
        }
        for (int i = 0; i < leng; i++) {
            char c = username.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                //用户名中有除数字和字母之外的字符
                return false;
            }
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {//判断用户名的大小写字母有多少
                count++;
                break;//一旦用户名中有字母,则用户名就不为纯数字,结束循环并返回ture
            }
        }
        return count > 0;//count = 0 用户名中全是数字,返回false
        //用户名中不能是纯数字
    }

    public static int Judgment1(String username,ArrayList<User> list1){//判断用户是否存在
        for (int i = 0; i < list1.size(); i++) {
            User user = list1.get(i);//得到集合内的每个元素
            if(username.equals(user.getUserName())){
                return i;
            }
        }
        return -1;
    }
    private static String getCode(){//生成验证码,验证码的长度为5 有一位数字,数字可以是任意位置
        ArrayList<Character> arr = new ArrayList<>();//用一个集合来放所有的大小写字母
        Random r = new Random();
        for (int i = 0; i < 26; i++) {
            arr.add((char) ('a' + i));
            arr.add((char) ('A' + i));//把大小写字母添加进集合里
        }
        StringBuilder sb = new StringBuilder();//用一个StringBuilder类来接收五位验证码
        for (int i = 0; i < 4; i++) {
            int number = r.nextInt(arr.size());//生成四位随机下标
            char c = arr.get(number);
            sb.append(c);//把随机下标获取到的随机大小写字母添加进StringBuilder类里
        }
        int number1 = r.nextInt(10);//生成一个随机数字 范围为0~9
        char c1 = (char) (number1 + '0');
        sb.append(c1);//把获取到的随机数字添加进StringBuilder类
        //将StringBuilder类转换成字符数组
        char[] SB = sb.toString().toCharArray();
        int figure = r.nextInt(SB.length - 1);
        //生成一位随机下标,将数字和随机下标的元素交换,达到数字可以是任意位置的条件
        char tmp = SB[figure];
        SB[figure] = SB[SB.length - 1];
        SB[SB.length - 1] = tmp;
        //将字符数组转回成字符串并打印
        String str = new String(SB);
        return str;
    }
}


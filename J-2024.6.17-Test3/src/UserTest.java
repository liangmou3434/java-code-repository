import java.util.ArrayList;
import java.util.Scanner;

public class UserTest {//在集合中存入三个用户 定义一个方法用id查找用户信息 如果有返回true 如果没有返回false

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();//创建一个空集合
        User u1 = new User("001","张三","123456");
        User u2 = new User("002","李四","456789");
        User u3 = new User("003","王五","678912");
        list.add(u1);
        list.add(u2);
        list.add(u3);//把对象添加进集合中
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的id: ");
        String id = sc.next();
        boolean result = CheckUser(id,list);
        System.out.println(result);
    }
    public static boolean CheckUser(String id,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
           if(u.getId().equals(id)){
               return true;
           }
        }
        return false;
    }
}

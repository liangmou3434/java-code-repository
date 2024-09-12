import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String talk = "SB,你玩的真好,下次不要再玩了,TMD";
        String[] arr = {"TMD","SB","CNM","MLGB"};//创建敏感词汇
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
    public static void main2(String[] args) {//用身份证号码判断人物信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身份证号码: ");
        String idNumber = sc.next();
        String year = idNumber.substring(6,9+1);//7~14位为出生的年月日 第7~10位为年 下标为6~9
        String month = idNumber.substring(10,11+1);//11~12位为年
        String day = idNumber.substring(12,13+1);//13~14位为日
        String borninfo = year + "年" + month + "月" + day +"日";
        System.out.println(borninfo);
        char sex = idNumber.charAt(16);//17位为判断人的性别下标为16 如果是偶数则是女 奇数为男
        if((sex - 0 -48) % 2 == 0){
            System.out.println("性别: 女");
        }else{
            System.out.println("性别: 男");
        }
        //字符零对应的十进制数字为48
        //0--48
        //1--49
        //2--50
        //3--51
        //4--52
        //5--53
        //6--54
        //7--55
        //8--56
        //9--57
    }
    public static void main1(String[] args) {//对手机号码进行加密 截取字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你十一位的手机号码:");
        String phoneNumber = sc.next();
        String start = phoneNumber.substring(0,2+1);//取出0~2下标的号码
        String end = phoneNumber.substring(7);//从第七位开始取 取到末尾
        //拼接整个号码
        for (int i = 0; i < (11-2-4); i++) {
            start += "*";
        }
        start += end;
        System.out.println(start);
    }
}

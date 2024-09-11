import java.util.Random;

public class Test {//使用方法形成五位随机验证码,前四位是大写或小写字母,最后一位是数字
    public static void main(String[] args) {
        System.out.println("你获取的五位随机验证码是: ");
        generate();
    }
    public static void generate(){
        //创建一个字符数组把字母的大小写存进去
       char[] array = new char[52];
        for (int i = 0; i < array.length; i++) {
            if(i <= 25) {
                array[i] = (char) (97 + i);//使用ASCII码标 97+25为小写字母的范围
            }else{
                array[i] = (char)(65 + i - 26);//大写字母从65开始
            }
        }
//        for (int i = 0; i < array.length; i++) {//验证所有的大小字母是否已经放进字符数组
//            System.out.print(array[i]+" ");
//        }
        Random r = new Random();//生成五位随机数
        for (int i = 0; i < 4; i++) {//生成四位字母随机数
            int number = r.nextInt(array.length+1);
            char letters = array[number];
            System.out.print(letters+" ");
        }
       int number1 = r.nextInt(10+1);//最后一位为数字的随机数 范围为0~10
        System.out.print(number1);
    }
}

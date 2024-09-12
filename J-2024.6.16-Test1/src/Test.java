import java.util.Random;

public class Test {
    public static void main(String[] args) {//生成验证码 长度为5 可以是大小写字母 但数字可以是任意位置
        char[] arr = new char[52];//创建一个字符数组,把大小写都存进去
        for (int i = 0; i < arr.length; i++) {
            if(i <= 25) {
                arr[i] = (char) (97 + i);//使用ASCII码标 97+25为小写字母的范围
            }else{
                arr[i] = (char)(65 + i - 26);//大写字母从65开始
            }
        }
        Random r = new Random();
       char[] arrays = new char[5];//创建一个字符数组用来接收生成的验证码
        for (int i = 0; i < 4; i++) {
            int number = r.nextInt(52);//生成四位随机数下标
            char c = arr[number];//获取到随机数下标对应的字母
            arrays[i] = c;//把获取到随机下标对应的字母放到字符数组中
        }
        int number = r.nextInt(9+1);//获取一个0~9的随机数
        arrays[arrays.length - 1] = (char)(number + '0');
        //再生成一个随机数 将在字符数组最后的数字和字符数组中随机一个字符交换
        int figure = r.nextInt(3+1);
        char tmp = arrays[arrays.length - 1];
        arrays[arrays.length - 1] = arrays[figure];
        arrays[figure] = tmp;
        //最后把字符数组变成字符串
        String str = new String(arrays);
        System.out.println(str);
    }
}

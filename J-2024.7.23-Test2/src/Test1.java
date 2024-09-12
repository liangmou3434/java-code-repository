public class Test1 {
//    自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和
//    三位自幂数：水仙花数 四位自幂数：四叶玫瑰数
//    五位自幂数：五角星数 六位自幂数：六合数
//    七位自幂数：北斗七星数 八位自幂数：八仙数
//    九位自幂数：九九重阳数 十位自幂数：十全十美数
public static void main(String[] args) {
    //统计有多少个水仙花数
    int count = 0;
    for (int i = 100; i <999 ; i++) {
        int single = i % 10;
        int ten = i / 10 % 10;
        int hundred = i / 10 / 10 % 10;
        double sum = Math.pow(single,3) + Math.pow(ten,3) + Math.pow(hundred,3);
        if(sum == i){
            count++;
            System.out.println(i + "这个数是水仙花数");
        }
     }
    System.out.println("三位数中一共有"+ count + "个水仙花数");
}
}

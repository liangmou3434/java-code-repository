package a01排序题demo1;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        //定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
//        要求1：属性有姓名、年龄、身高。
//        要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
//       （姓名中不要有中文或特殊字符，会涉及到后面的知识）
        //创建一些女朋友对象
        GirlFriend gf1 = new GirlFriend("zhangsan",18,1.66);
        GirlFriend gf2 = new GirlFriend("zhangsi",19,1.68);
        GirlFriend gf3 = new GirlFriend("zhangswu",19,1.59);

        GirlFriend[] gf = {gf1,gf2,gf3};//定义数组存储女朋友对象

        //利用Arrays中的sort方法进行排序
     Arrays.sort(gf, (o1,o2)->{
             //排序规则:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
            double temp = o1.getAge() - o2.getAge();
             //如果年龄大小一致,则使用身高排序,如果年龄大小不一致,继续使用年龄排序
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
             //如果身高大小一致,则使用姓名的字母进行排序,如果身高大小不一致,继续使用身高排序
             temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            if(temp > 0){
                return 1;
            }else if(temp < 0){
                return -1;
            }else{
                return 0;
            }

     });
        System.out.println(Arrays.toString(gf));
    }
}

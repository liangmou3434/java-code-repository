public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];//创建一个长度为4的数组用来接收四位不同的女朋友
        GirlFriend gf1 = new GirlFriend("小乔",18,"女","唱歌");
        GirlFriend gf2 = new GirlFriend("大乔",22,"女","跳舞");
        GirlFriend gf3 = new GirlFriend("鲁班",19,"男","阅读");
        GirlFriend gf4 = new GirlFriend("狄仁杰",20,"男","跑步");
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {//计算女朋友们年龄的总和
            GirlFriend gf = arr[i];
            sum += gf.getAge();
        }
        double ret = sum / arr.length;//计算四位女朋友年龄的平均值
        System.out.println("四位女朋友大约的平均年龄是： "+ret);
        int count = 0;//统计年龄比平均值小的女朋友有几个
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge() < ret) {
                count++;
                System.out.println("这位女朋友的名字是："+gf.getName()+" 年龄是："+gf.getAge()+
                        " 性别是："+gf.getGender()+" 爱好是： "+gf.getHobby());
            }
        }
        System.out.println("年龄小于平均值的女朋友一共有"+count+"个");
    }
}

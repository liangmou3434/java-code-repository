import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //基本查找/顺序查找
        //从0索引开始往后找
        //需求:定义一个方法利用基本查找,查询某个元素是否存在
        //数据如下：{131，127，147，81，103，23，7，79}
        ArrayList<String> list = new ArrayList<>();
        String[] str = {"131","127","147","81","103","23","7","79",};
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);//把数组的所有元素放进 集合里
        }
        System.out.println(Check(list,"131"));
    }
    public static boolean Check(ArrayList<String> list,String num){
        boolean ret = false;
        for (int i = 0; i < list.size(); i++) {
            ret = num.equals(list.get(i));
            if(ret == true){
                return true;
            }
        }
        return false;
    }
}

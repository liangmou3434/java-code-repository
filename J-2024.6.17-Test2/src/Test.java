import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {//定义一个集合,并添加数字,遍历-用int类型对应的包装类
        //int - Integer  char - Character 其他基本数据类型对应的包装类将首字母大写 如 double - Double
        ArrayList<Integer> list  =  new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        String ret = "[";
        for (int i = 0; i < list.size(); i++) {
            Integer str = list.get(i);
            if(i == list.size() - 1){
                ret = ret + str + "]";
            }else{
                ret = ret + str + ",";
            }
        }
        System.out.println(ret);
    }
    public static void main1(String[] args) {//定义一个集合 储存类型为字符串类型,遍历他
        ArrayList<String> list  =  new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        System.out.println(list);
        String ret = "[";
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if(i == list.size() - 1){
                ret = ret + str + "]";
            }else{
                ret = ret + str + ",";
            }
        }
        System.out.println(ret);
    }
}

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
            //课堂练习2：
            //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
            //要求：需要考虑数组中元素有重复的可能性
            //{131,127,147,81,103,23，7,79,81}
            //查找81，想要返回的是所有索引3 8
        int[] arr = {131,127,147,81,103,23,7,79,81};
        ArrayList<Integer> list1 = new ArrayList<>();
        list1 = Check(arr,81);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+" ");
        }

    }
    //如果需要返回多个数据,则把数据放在数组或集合中,将数组或集合返回就可以了
    public static ArrayList<Integer> Check(int[] arr, int num){
        //创建一个新的集合来放多个索引
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                list.add(i);
            }
        }
        return list;
    }
}

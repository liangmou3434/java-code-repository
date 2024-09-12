import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {//Arrayslist集合一些使用方法的说明
        ArrayList<String> list = new ArrayList<>();//创建一个空集合 并且集合里面储存的元素为String类型
        //空参打印为[]
        System.out.println(list);//打印结果为[]
        //ArrayList里的类型只能是引用数据类型,且集合的长度可以自动扩充
        //添加元素
        list.add("aaa");//返回值为布尔类型
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);//打印结果为[aaa,bbb,ccc,ddd]
        //删除元素
        boolean result  = list.remove("aaa");//括号内填写需要删除的内容--返回值为布尔类型
        String str = list.remove(0);//括号内填写需要删除内容对应的下标--返回值为被删除的元素
        System.out.println(result);//打印结果为true
        System.out.println(str);//打印结果为bbb
        //修改集合内的元素
        String str1 =  list.set(1,"aaa");//1为需要修改的元素对应的下标 "aaa"为1对应下标修改后的内容--返回结果为1下标的内容
        //查询
        list.get(0);//查找list集合内0下标的元素
        //遍历
        int leng = list.size();//获得list的长度
        for (int i = 0; i < list.size(); i++) {//遍历list内的元素

        }
    }
}

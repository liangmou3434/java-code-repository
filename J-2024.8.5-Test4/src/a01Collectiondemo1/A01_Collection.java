package a01Collectiondemo1;

import java.util.ArrayList;
import java.util.Collection;

public class A01_Collection {
    public static void main(String[] args) {
//       public boolean add(要添加的元素)      添加
//        public void clear()                清空
//        public boolean remove(E e)         删除
//        public boolean contains（Object obj）判断是否包含
//        public boolean isEmpty()           判断是否为空
//        public int size()                  集合长度

        //Collection是一个接口,不能直接创建对象
        //所以使用Collection的方法时,只能创建它的实现类对象
        //Collection的其中一个实现类:ArrayList

        //使用多态的方法创建对象
        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //如果要往List系列集合中添加数据,那么方法永远返回true,因为list集合是允许元素重复的
        //如果往Set系列集合中添加数据,如果当前元素不存在,则返回true,表示添加成功,
        // 如果当前元素已经存在,则返回false,表示添加失败
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll );//[aaa, bbb, ccc]

        //2.清空集合
//        coll.clear();
//        System.out.println(coll);//[] 把集合内所有元素都清空

        //3.删除元素
        //因为Collection里面定义的是共性的方法,所以此时不能通过索引进行删除,只能通过元素对象进行删除
        //方法会有一个布尔类型的返回值,删除成功返回true,删除失败返回false
        //如果要删除的元素不存在,就会返回false
        coll.remove("aaa");
        System.out.println(coll);//[bbb, ccc]

        //4.判断元素是否包含
        //底层是通过equals方法进行判断是否存在的
        //如果集合中储存的事自定义对象,也想通过contains方法来判断是否包含,那么在javaBean类中,一定要重写equals方法
        boolean ret = coll.contains("bbb");
        System.out.println(ret);//true

        //5.判断集合是否为空
        boolean ret2 = coll.isEmpty();
        System.out.println(ret2);//false-集合不为空

        //6.获取集合的长度
        System.out.println(coll.size());//2
    }
}

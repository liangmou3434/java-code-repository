import java.util.LinkedList;

public class A01_LinkeList {
    public static void main(String[] args) {
//        public void addFirst(E e)   在该列表开头插入指定的元素
//        public void addLast(E e)    将指定的元素追加到此列表的末尾
//        public E getFirst()         返回此列表中的第一个元素
//        public E getLast()          返回此列表中的最后一个元素
//        public E removeFirst()      从此列表中删除并返回第一个元素
//        public E removeLast()       从此列表中删除并返回最后一个元素

        //创建对象
        LinkedList<String> lkl = new LinkedList<>();
        lkl.add("aaa");
        lkl.add("bbb");
        lkl.add("ccc");//在集合中添加元素
        System.out.println(lkl);//[aaa, bbb, ccc]

        //1.在该列表开头插入指定的元素
         lkl.addFirst("fff");//将fff插到集合的开头
        System.out.println(lkl);//[fff, aaa, bbb, ccc]

        //2.将指定元素追加到此列表的末尾
        lkl.addLast("kkk");//将kkk追加到集合的末尾
        System.out.println(lkl);//[fff, aaa, bbb, ccc, kkk]
    }
}

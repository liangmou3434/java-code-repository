import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //Ojects类
//        public static boolean equals(object a,Object b) 先做非空判断，比较两个对象
//        public static boolean isNull(object obj)        判断对象是否为nul1，为nul1返回true，反之则为false
//        public static boolean nonNull(object obj)       判断对象是否为null，跟isNull的结果相反

      Student s1 = new Student("张三",19);
      Student s2 = null;

      //比较两个对象的属性值是否相同
//        boolean result = Objects.equals(s1,s2);
//        System.out.println(result);//true

//        boolean result1 = Objects.isNull(s2);//null返回true,非null返回false
//        System.out.println(result1);//true

//        boolean result2 = Objects.nonNull(s2);//null返回false,非null返回true
//        System.out.println(result2);//false
    }
}

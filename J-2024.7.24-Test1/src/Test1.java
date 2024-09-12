public class Test1 {
    public static void main(String[] args) {
        // public boolean equals（object obj)      比较两个对象是否相等
        Student s1  = new Student("zhangsan",23);
        Student s2  = new Student("zhangsan",23);

        System.out.println(s1.equals(s2));//原eqauls比较的是两个对象的地址值
        //如果需要比较两个对象的属性值,就需要在Student类里重写equals方法,

        String s="abc";
        StringBuilder sb =new StringBuilder("abc");
        System.out.println(s.equals(sb));//false equals方法被s调用,看String类里的equals方法
        //字符串中的equals方法,先判断参数是否为字符串,如果是字符串,再比较内部的属性,如果参数不是字符串,直接返回false
        //StringBuilder类的sb不是字符串,所以直接返回false

        System.out.println(sb.equals(s));//false equals方法被sb调用,看StringBuilder类的equals方法
        //在StringBuilder当中,没有重写equal方法,调用的是Oject中的,Object类中equals方法比较两个对象的地址值
        //sb和地址值和s的地址值不一样,所以返回的是false
    }
}

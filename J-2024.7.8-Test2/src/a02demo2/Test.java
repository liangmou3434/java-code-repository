package a02demo2;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Dog d  = new Dog("小狗",3);
        System.out.println(d.getName() + "," + d.getAge());
        frog f = new frog("青蛙",5);
        System.out.println(f.getName() + "," + f.getAge());
        Sheep s = new Sheep ("山羊",2);
        System.out.println(s.getName() + "," + s.getAge());
    }
}

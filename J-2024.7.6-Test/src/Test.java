import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class Test {
//    1.定义狗类
//    属性：年龄，颜色
//    行为：eat(String something)(something表示吃的东西）
//    看家lookHome方法（无参数）
//    2.定义猫类
//    属性：年龄，颜色
//    行为：eat(String something)方法(something表示吃的东西)
//    逮老鼠catchMouse方法（无参数）
      //3.定义Person类//饲养员
//    属性：姓名，年龄
//    行为：keepPet(Dog dog,String something)方法
//    功能：喂养宠物狗，something表示喂养的东西
//    行为：keepPet(Catcat,String something)方法
//    功能：喂养宠物猫，something表示喂养的东西
//    生成空参有参构造，set和get方法
//4.定义测试类(完成以下打印效果)：
//    keepPet(Dogdog,Stringsomethind)方法打印内容如下：
//    年龄为30岁的老王养了一只黑颜色的2岁的狗
//    2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
//    keepPet(Catcat,String somethind)方法打印内容如下：
//    年龄为25岁的老李养了一只灰颜色的3岁的猫1
//    3岁的灰颜色的猫眯着眼睛侧着头吃鱼
    public static void main(String[] args) {
        Person p1 = new Person("老王",30);
        Animal a1 = new Dog("黑颜色",2);
        p1.keepPet(a1,"骨头");


        Person p2 = new Person("老李",25);
        Animal a2 = new Cat("灰颜色",3);
        p1.keepPet(a2,"鱼");
    }
}

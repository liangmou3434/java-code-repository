/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-05-13
 * Time: 18:51
 */
class Animal {//父类  把两个类里共有的成员属性和成员方法放到同一个类里作为父类
    //对共性的抽取 从而达到对到吗的复用（重复使用）
    //子类继承父类后会把属性和方法全部继承
    //子类继承父类后必须要新添加自己特有的成员
    //一般情况下 子类不能继承超过三层
    public String name;
    public int age;
    public void eat(){
        System.out.println(name+"正在吃饭!");//两个动物共有的行为
    }
}

class Dog extends Animal {//子类

    public void barks() {
        System.out.println(name + "汪汪叫！");//狗的特性

    }

    class Cat extends Animal {//子类

        public void Catchmouse() {
            System.out.println(name + "在抓老鼠……");//猫的特性
        }
    }

    public class Test {
    }
}


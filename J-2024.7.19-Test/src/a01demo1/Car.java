package a01demo1;

import org.w3c.dom.ls.LSOutput;

import javax.imageio.stream.ImageInputStream;

public class Car {//外部类
    String carName = "小米";
    int carAge = 4;
    String carColor = "白色";
//    public void show1(){
////        System.out.println(engineName);//外部类不能直接访问内部类的成员,要创建对象
//    }
    Engine e  = new Engine();//先创建对象,再调用内部类的对象
    public void show(){
        System.out.println(carName);
        System.out.println(e.engineName);
    }
    public class Engine{//内部类--内部类是外部类的一部分,内部类单独存在没有意义
        String engineName = "引擎";//汽车引擎名字
        int engineAge;//汽车引擎年龄
      public void show(){
          System.out.println(carName + "," + carAge + "," + carColor);//内部类可以直接访问外部类的成员,包括私有的
          //外部类访问内部类要创建对象
      }

    }
}

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-30
 * Time: 19:26
 */
final class Animal {
   String name = "牧羊犬";
   void shout(){
      System.out.println("");
    }
  class Dog extends Animal{
       public void shout(){
            System.out.println("汪汪汪……");
       }
        public void printName(){
            System.out.println("名字"+super.name);
        }
    }
    public class Example{
        public  void main(String[] args){
//
//        }
//    }
//}


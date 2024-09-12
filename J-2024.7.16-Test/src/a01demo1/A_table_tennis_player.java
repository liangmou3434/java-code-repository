package a01demo1;

public class A_table_tennis_player extends Player implements Speak{
    public A_table_tennis_player() {
    }
    public A_table_tennis_player(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn(){
     System.out.println("乒乓球运动员学乒乓球");
   }
 @Override
    public void sayEnglish(){
     System.out.println("乒乓球运动员说英语");
 }


}

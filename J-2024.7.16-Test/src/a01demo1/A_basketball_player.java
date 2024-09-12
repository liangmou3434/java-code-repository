package a01demo1;

public class A_basketball_player extends Player{
    public A_basketball_player() {
    }
    public A_basketball_player(String name, int age) {
        super(name, age);
    }
    @Override
    public void learn(){
        System.out.println("篮球运动员学打篮球");
    }

}

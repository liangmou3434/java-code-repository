package a01demo1;

public class Basketball_coach extends Coach{
    public Basketball_coach() {
    }
    public Basketball_coach(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach(){
        System.out.println("篮球教练教篮球");
    }
}

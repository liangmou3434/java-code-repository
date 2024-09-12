package a01demo1;

public class Table_tennis_coach extends Coach implements Speak{
    public Table_tennis_coach() {
    }
    public Table_tennis_coach(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach(){
        System.out.println("乒乓球教练教乒乓球");
    }
    @Override
    public void sayEnglish(){
        System.out.println("乒乓球教练说英语");
    }
}

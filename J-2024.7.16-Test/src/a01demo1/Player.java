package a01demo1;

public abstract class Player extends Person{
    public Player() {
    }
    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void learn();
}

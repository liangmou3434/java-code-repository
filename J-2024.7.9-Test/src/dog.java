public class dog extends Animal implements swim{
    public dog() {
    }
    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
    @Override
    public void Swim(){
        System.out.println("狗游泳的方式为狗刨");
    }
}

public class frog extends Animal implements swim {
    public frog() {
    }
    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("青蛙吃虫子");
    }
    @Override
    public void Swim(){
        System.out.println("青蛙的游泳方式为蛙泳");
    }
}

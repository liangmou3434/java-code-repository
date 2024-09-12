public class Person {
    private String name;
    private int age;

    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal,String something){
        if(animal instanceof Dog) {
            System.out.println("年龄为" + this.age + this.name + "养了一只"
                    + animal.getColor() + "的" + animal.getAge() + "狗");
         animal.eat("骨头");
        }else{
            System.out.println("年龄为" + this.age + this.name + "养了一只"
                    + animal.getColor() + "的" + animal.getAge() + "猫");
            animal.eat("鱼");
        }
    }
}

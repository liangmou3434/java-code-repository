import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Dog {
    public String name;
    private int age;//private关键字
    public void setAge(int a){
        if(a >= 0 && a<= 50){
            age = a;
        }else{
            System.out.println("年龄输入错误");
        }
    }

    public int getAge() {
        return age;
    }
    public void Bark(){
        System.out.println(age+"岁的"+name+"正在汪汪叫……");
    }
    public void Eat(){
        System.out.println(age+"岁的"+name+"正在吃饭……");
    }
}

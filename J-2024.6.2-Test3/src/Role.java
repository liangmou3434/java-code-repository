import java.util.Random;

public class Role {//格斗游戏
    private String name;//姓名
    private int blood;//血量
    private char gender;
    private String face;
    String[] boysfaces = {"气宇轩昂","风流俊雅","相貌英俊","五官端正","相貌平平","面目狰狞","一塌糊涂"};
    String[] girlsfaces = {"美奂绝伦","沉鱼落雁","亭亭玉立","身材姣好","相貌平平","相貌简陋","惨不忍睹"};
    public Role(){//空的构造方法
    }
    public Role(String name,int blood,char gender){//带全部参数的构造方法
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public void setFace(char gender) {
        //随机选择面貌
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boysfaces.length);
            this.face = boysfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlsfaces.length);
            this.face = girlsfaces[index];
        }else{
            this.face = "面目狰狞";
        }
    }
    public String getFace(){
        return face;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setBlood(int blood){
        this.blood = blood;
    }
    public int getBlood(){
        return blood;
    }
    //方法的调用者攻击参数 参数为被攻击者
    public void attack(Role role){//Role 为引用数据类型
        //随机造成1~20点上号
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int blood1 = role.getBlood() - hurt;//被攻击后，被攻击者 剩下的血量
         blood1 =  blood1 < 0 ? 0 : blood1;//如果血量变成赋值 则修改为0
        role.setBlood(blood1);//把角色的血量修改
       //this 为方法的调用者 攻击者本类中的name
        System.out.println(this.getName()+"打了"+role.getName()+"一拳,造成了"+hurt+"点伤害"+
                role.getName()+"还剩"+blood1+"血量");
    }
    public void showimfo(){//展示角色的信息
        System.out.println("姓名为："+getName());
        System.out.println("血量为："+getBlood());
        System.out.println("性别为："+getGender());
        System.out.println("相貌为："+getFace());
    }
}


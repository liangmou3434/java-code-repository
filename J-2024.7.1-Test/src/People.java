public class People {//经理- 成员变量-工号,姓名,工资,管理奖金 成员方法-管理(管理其他人) 吃饭(吃米饭)
    //员工- 成员变量-工号,姓名,工资 成员方法-工作(炒菜) 吃饭(吃米饭)
    private String id;//工号
   private String name;
    private int wages;//工资

    public People() {
    }
    public People(String id, String name, int wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getWages() {
        return wages;
    }
    public void setWages(int wages) {
        this.wages = wages;
    }

    public void work(){
        System.out.println(name + "的工作");
    }
    public void eat(){
        System.out.println(name + "吃米饭");
    }
}

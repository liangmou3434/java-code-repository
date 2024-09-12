public class Manager extends People{
    //经理- 成员变量-工号,姓名,工资,管理奖金 成员方法-管理(管理其他人) 吃饭(吃米饭)
   private double bonus;

    public Manager() {
    }
    public Manager(String id, String name, int wages, double bonus) {//继承父类的有参构造
        super(id, name, wages);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
   public void work(){
       System.out.println("经理的工作是管理其他人");
   }

}

public class Staff extends People{
    //员工- 成员变量-工号,姓名,工资 成员方法-工作(炒菜) 吃饭(吃米饭)

    public Staff() {
    }

    public Staff(String id, String name, int wages) {
        super(id, name, wages);
    }

    @Override
    public void work(){
        System.out.println("员工的工作是炒菜");
    }
}

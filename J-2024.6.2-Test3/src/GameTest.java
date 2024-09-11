public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("大乔",100,'女');//创建第一个角色
        Role r2 = new Role("鲁班",100,'男');//创建第二个角色

        //展示角色信息
        r1.showimfo();
        r2.showimfo();

        while(true){
            //攻击为回合制 r1先攻击r2 r2再攻击r1
            r1.attack(r2);//r1攻击r2
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+"K.0了"+r2.getName());
                break;
            }
            r2.attack(r1);//r2攻击r1
            if(r1.getBlood() == 0){
                System.out.println(r2.getName()+"K.0了"+r1.getName());
                break;
            }
        }
    }
}

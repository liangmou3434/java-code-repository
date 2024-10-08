package a01demo1;

public class Test {
    //    我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。
//    为了出国交流，跟乒乓球相关的人员都需要学习英语。
//    请用所有知识分析，在这个案例中，哪些是具体类，哪些是抽象类，哪些是接口？
//    乒乓球运动员：姓名，年龄，学打乒乓球，说英语
//    篮球运动员：姓名，年龄，学打篮球
//    乒乓球教练：姓名，年龄，教打乒乓球，说英语
//    篮球教练：姓名，年龄，教打篮球
    public static void main(String[] args) {
        A_table_tennis_player p = new A_table_tennis_player("张三", 19);
        p.learn();
        p.sayEnglish();

        A_basketball_player p1 = new A_basketball_player("李四",20);
        p1.learn();

        Basketball_coach c = new Basketball_coach("篮球教练",35);
        c.teach();
        
        Table_tennis_coach c1 = new Table_tennis_coach("乒乓球教练",37);
        c1.teach();
        c1.sayEnglish();

    }
}

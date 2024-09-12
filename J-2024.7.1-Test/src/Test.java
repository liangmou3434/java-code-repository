public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001","张三",3000,0.0);
        System.out.println(m.getId() + "," + m.getName() + ","
                + m.getWages() + "," + m.getBonus());

        Staff s = new Staff();
        s.setId("002");
        s.setName("李四");
        s.setWages(2500);
        System.out.println(s.getId() + "," + s.getName() + ","
                + s.getWages());

    }
}

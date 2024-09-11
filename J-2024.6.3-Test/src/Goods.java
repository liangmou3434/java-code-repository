public class Goods {
    private String id;
    private String name;//商品的名字
    private double prize;//商品的价格
    private int count;//商品的库存

    public Goods() {//空的构造方法
    }

    public Goods(String id, String name, double prize, int count) {//含全部参数的构造方法
        this.id = id;
        this.name = name;
        this.prize = prize;
        this.count = count;
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

    public double getPrize() {
        return prize;
    }
    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}

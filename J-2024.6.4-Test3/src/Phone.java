public class Phone {
    private String brand;//品牌
    private double prize;//价格
    private String color;//颜色
    public Phone(){
    }
    public Phone(String brand,double prize,String color){
        this.brand = brand;
        this.prize = prize;
        this.color = color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setPrize(double prize){
        this.prize = prize;
    }
    public double getPrize(){
        return prize;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}

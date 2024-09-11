public class Car {
    private String brand;//汽车的品牌
    private double prize;//汽车的价格
    private String color;//汽车的颜色

    public Car() {
    }
    public Car(String brand,double prize,String color){
        this.brand = brand;
        this.prize = prize;
        this.color = color;
    }

    public void setBran(String brand){
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

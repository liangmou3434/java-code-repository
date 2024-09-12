public class Phone {
    private String brand;
    private int price;
    public Phone(){
    }
    public Phone(String brand,int price){
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setPrice(){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}

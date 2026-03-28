public class Purchase {
    private String name;
    private  double price;
    private SimpleData date;

    public Purchase(String name, double price, SimpleData date){
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getName(){
        return name;
    }
    public  double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return name+";"+price+";"+date;
    }
}

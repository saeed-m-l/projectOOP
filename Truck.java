import java.util.ArrayList;

public class Truck {
    public final int maxcapacity = 15;
    public int usedCapacity=0;
    int timetoFinish = 10;
    boolean isAvailable = true;
    public int totalCost=0;
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Animal> animals = new ArrayList<>();
    public int UsedCapacity(){
        for(Product p : products){
            usedCapacity+= p.getCapacity();
        }
        for (Animal a : animals){
            usedCapacity+=a.getCapacity;
        }
        return usedCapacity;
    }
    public boolean isAvailable(){
        if(isAvailable== true && usedCapacity <= maxcapacity){
            isAvailable = true ;
        }
        else {
            isAvailable=false;
        }
        return isAvailable;
    }
    public int totalCost(){
        for(Product p : products){
            totalCost+= p.getPrice();
        }
        for (Animal a : animals){
            totalCost+=a.getPrice;
        }
        return totalCost;
    }
    public void run(){
        totalMoney+=totalCost;
        usedCapacity=0;
        products.clear();
        animals.clear();
    }


}

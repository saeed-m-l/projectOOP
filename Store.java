import java.util.ArrayList;
public class Store {
//private final int maxLevel=2;
//private int level=1;
//public void levelUp(){
//    if(level==1){
//        //todo
//    }
//    System.out.println("you are in max level");
//}

    //im doubt about this
    ArrayList<WildAnimal> animals=new ArrayList<>();
    ArrayList<Product>products=new ArrayList<>();
    private final int maxCapacity=30;
    private int capacity=0;
    public void addAnimal(WildAnimal animal){
            if(possible( animal.getCapacity())){
                animals.add(animal);
            }
    }
    public void addProduct(Product product){
        if(possible(product.getCapacity())){
            products.add(product);
        }
    }
    private boolean possible(int capacity){
        if(capacity+this.capacity>maxCapacity){
            System.out.println("no more storage");
            return false;
        }
        this.capacity+=capacity;
        return true;
    }
}

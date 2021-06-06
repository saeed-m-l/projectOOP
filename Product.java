public abstract class Product {
    private String name;
    private int price;
    private int capacity;
    //int number ;
    public Product(String name, int price, int capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getCapacity() {
        return capacity;
    }
}

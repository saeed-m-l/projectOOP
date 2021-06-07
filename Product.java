public enum Product {
    BREAD(80, 4),
    CLOTH(50, 2),
    DRESS(100 , 4),
    EGG(15, 1),
    FEATHER(20 , 1),
    FLOUR(40 , 2),
    ICECREAM(120 , 4),
    MILK1(25, 1);

    private String name;
    private int price;
    private int capacity;
    //int number ;
    Product(int price, int capacity) {
        this.price = price;
        this.capacity = capacity;
    }
    public int getPrice() {
        return price;
    }
    public int getCapacity() {
        return capacity;
    }
}

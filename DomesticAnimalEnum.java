public enum DomesticAnimalEnum {
    GOOSE(Egg,0,0,0,0),
    COW(Wool,0,0,0,0),
    CHICKEN(Egg,0,0,0,0);
    private final String product;
    private final int speed;
    private final int buyPrice;

    public int getSpeed() {
        return speed;
    }

    private final int sellPrice;
    private final int size;

    DomesticAnimalEnum(Product product, int speed, int buyPrice, int sellPrice, int size) {
        this.product = product;
        this.speed = speed;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.size = size;
    }
}

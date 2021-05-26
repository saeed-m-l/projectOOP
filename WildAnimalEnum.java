public enum WildAnimalEnum {
    LION(10,10,10),
    BEAR(20,20,20)
    ;
    private final int maxHIt;
    private final int maxSpeed;
    private final int sellPrice;

    public int getMaxHIt() {
        return maxHIt;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    WildAnimalEnum(int maxHIt, int speed, int sellPrice) {
        this.maxHIt = maxHIt;
        this.maxSpeed = speed;
        this.sellPrice = sellPrice;
    }
}

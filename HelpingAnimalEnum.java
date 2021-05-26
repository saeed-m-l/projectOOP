public enum HelpingAnimalEnum {
    CAT(0,0,0,'C'),
    DOG(0,0,0,'A');
    private final int buyPrice;
    private final int sellPrice;
    private final char task;
    private final int speed;

    public int getSpeed() {
        return speed;
    }

    HelpingAnimalEnum(int buyPrice, int sellPrice, int spped, char task) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.speed=spped;
        this.task = task;
    }
}

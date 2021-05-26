public class DomesticAnimal extends Animal {
    int hungryLevel;
    private final int maxHungry=10;
    private int hungry;

    @Override
    void motion() {
        if(makeRandom()%3==0){
            x+=domesticAnimalEnum.getSpeed();
        }
        else x-=domesticAnimalEnum.getSpeed();
        if(makeRandom()%3==2) y+=domesticAnimalEnum.getSpeed();
        else y-=domesticAnimalEnum.getSpeed();
    }

    public DomesticAnimal(int x, int y, int hungry, DomesticAnimalEnum domesticAnimalEnum, boolean isAlive) {
        super(x, y);
        this.hungry = hungry;
        this.domesticAnimalEnum = domesticAnimalEnum;
        this.isAlive = isAlive;
    }

    private DomesticAnimalEnum domesticAnimalEnum;
    public int getMaxHungry() {
        return maxHungry;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    private boolean isAlive=true;
    private static int timeToProduce;
    static {
        timeToProduce = 5;
    }
}

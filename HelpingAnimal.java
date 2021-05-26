public class HelpingAnimal extends Animal{
    private HelpingAnimalEnum helpingAnimalEnum;

    @Override
    void motion() {
        if(makeRandom()%3==0){
            x+= helpingAnimalEnum.getSpeed();
        }
        else x-=helpingAnimalEnum.getSpeed();
        if(makeRandom()%3==2) y+=helpingAnimalEnum.getSpeed();
        else y-=helpingAnimalEnum.getSpeed();
    }

    public HelpingAnimal(int x, int y, HelpingAnimalEnum helpingAnimalEnum) {
        super(x, y);
        this.helpingAnimalEnum = helpingAnimalEnum;
    }
    //TODO purpose
}

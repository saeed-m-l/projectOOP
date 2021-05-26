public class WildAnimal extends Animal {
    private int hit;
    WildAnimalEnum wildAnimalEnum;

    @Override
    void motion() {
        if(makeRandom()%3==0){
            x+=speed;
        }
        else x-=speed;
        if(makeRandom()%3==2) y+=speed;
        else y-=speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public WildAnimal(int x, int y, WildAnimalEnum wildAnimalEnum) {
        super(x,y);
        this.wildAnimalEnum=wildAnimalEnum;
        speed=wildAnimalEnum.getMaxSpeed();
    }
    private boolean isInert=false;
    private boolean inCage;
    private int speed;
    //algorithm
    void easeSpeed(){
        speed--;
    }
    void increaseSpeed(){
        speed++;
    }
    void hit(){
        if(hit< wildAnimalEnum.getMaxHIt()-1){
            hit++;
            easeSpeed();
            inCage=true;
        }
        else if(hit == wildAnimalEnum.getMaxHIt()-1){
            inCage=true;
            isInert=true;
            speed=0;
        }
    }
    void reverseHit(){
        if(inCage){
            if(hit<wildAnimalEnum.getMaxHIt()-1){
                increaseSpeed();
                hit++;
            }
            else if(hit==wildAnimalEnum.getMaxHIt()-1){
                hit++;
                speed=wildAnimalEnum.getMaxSpeed();
            }
        }
    }
    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    static short timeToRun=5;
}

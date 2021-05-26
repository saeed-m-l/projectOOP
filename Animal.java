import java.util.Random;
public abstract class Animal {
     int x;
     int y;
     abstract void motion();//TODO  limitation
    int makeRandom(){
        Random random=new Random(100);
        int i=100*random.nextInt()+1;
        return i%3;
    }
    public Animal(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
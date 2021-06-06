import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;

public class Level{
    public Level(int coin, int goldenTime, int argentTime, int bronzeTime) {
        this.coin = coin;
        this.goldenTime = goldenTime;
        this.argentTime = argentTime;
        this.bronzeTime = bronzeTime;
    }

    private Level level;
    private final int coin;
    private final int goldenTime;
    private final int argentTime;
    private final int bronzeTime;
    private ArrayList<DomesticAnimal> domesticAnimals;
    private HashSet<WildAnimal> wildAnimals;
    private Level loadLevel(int levelNum){
        Gson gson =new Gson();
        File file=new File(getLevelPath(levelNum));
        level=null;
        try{
            Reader reader=new FileReader(file);
            level=gson.fromJson(reader,Level.class);
        }catch (IOException exception){
            System.out.println("problem with file handling!!");
        }
        return level;
    }

    public int getCoin() {
        return coin;
    }

    public int getGoldenTime() {
        return goldenTime;
    }

    public int getArgentTime() {
        return argentTime;
    }

    public int getBronzeTime() {
        return bronzeTime;
    }

    public ArrayList<DomesticAnimal> getDomesticAnimals() {
        return domesticAnimals;
    }

    public HashSet<WildAnimal> getWildAnimals() {
        return wildAnimals;
    }

    private String getLevelPath(int levelNum){
        switch(levelNum){
            case 1:
                return "savesLevel\\Level1.json";

            case 2:
                return "savesLevel\\Level2.json";
            case 3:
                return "savesLevel\\Level3.json";
            case 4:
                return "savesLevel\\Level4.json";
            default:
                return null;
        }
    }

    //TODO  shops extra...
}
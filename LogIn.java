import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LogIn {
    HashMap<String,String> gamers;
    private String tmpPass;

    public LogIn() {
        loadClass();
    }

    public boolean isNew(String userID){
        for(Map.Entry<String,String> entry: gamers.entrySet()){
            if(entry.getKey().equals(userID)) {
                tmpPass=entry.getValue();
                return true;
            }
        }
            System.out.println("There is no ID with this name. please sign up first.");
            return false;

    }
    public void createAccount(String ID,String pass){
        gamers.put(ID,pass);
        System.out.println("account successfully created.");
        saveClass();
    }
    public boolean checkPass(String pass){
        return pass.equals(tmpPass);
    }
    private void saveClass(){
        String temp;
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        temp=gson.toJson(gamers);
        File file=new File("saves\\savedLogIns.json");
        try {
            file.createNewFile();
            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write(temp);
            fileWriter.close();
        }catch (IOException exception){
            System.out.println("problem whit file operating!!");
        }
    }
    private void loadClass(){
        Gson gson = new Gson();
        File file=new File("saves\\savedLogIns.json");
        try {
            Reader fileReader=new FileReader(file);
            // i took this from internet
            Type type = new TypeToken<HashMap<String, String>>(){}.getType();
            //
            gamers=gson.fromJson(fileReader,type);
        }catch (IOException exception){
            System.out.println("problem whit file handling!!");
        }
        if(gamers==null) gamers=new HashMap<>();
    }
}

package virtual.exhibition.MultiUser.Synchronizer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    private String jsonFilePath;

    private int playerID;
    private int[] playerPosition = new int[3];
    private int[] playerRotation = new int[3];
    private int[] playerScale = new int[3];

    public JsonReader(String jsonFilePath, int playerID){
        this.jsonFilePath = jsonFilePath;
        this.playerID = playerID;
    }

    public int[] getPlayerPosition() throws IOException, ParseException{

        JSONParser parser = new JSONParser();
        JSONObject player;
        Object obj = parser.parse(new FileReader(jsonFilePath));
        JSONObject jsonObject = (JSONObject) obj;

        JSONArray players = (JSONArray) jsonObject.get("player");

        if(playerID == 1) {
            player = (JSONObject) players.get(0);
        }else{
            player = (JSONObject) players.get(1);
        }


        JSONArray pos = (JSONArray) player.get("position");

        for(int i = 0; i < 3; i++)
            playerPosition[i] = (int) pos.get(i);

        return playerPosition;

    }

    public int[] getPlayerRotation() throws IOException, ParseException{
        JSONParser parser = new JSONParser();
        JSONObject player;
        Object obj = parser.parse(new FileReader(jsonFilePath));
        JSONObject jsonObject = (JSONObject) obj;

        JSONArray players = (JSONArray) jsonObject.get("player");

        if(playerID == 1) {
            player = (JSONObject) players.get(0);
        }else{
            player = (JSONObject) players.get(1);
        }


        JSONArray pos = (JSONArray) player.get("rotation");

        for(int i = 0; i < 3; i++)
            playerRotation[i] = (int) pos.get(i);

        return playerRotation;
    }

    public int[] getPlayerScale() throws IOException, ParseException{
        JSONParser parser = new JSONParser();
        JSONObject player;
        Object obj = parser.parse(new FileReader(jsonFilePath));
        JSONObject jsonObject = (JSONObject) obj;

        JSONArray players = (JSONArray) jsonObject.get("player");

        if(playerID == 1) {
            player = (JSONObject) players.get(0);
        }else{
            player = (JSONObject) players.get(1);
        }


        JSONArray pos = (JSONArray) player.get("scale");

        for(int i = 0; i < 3; i++)
            playerScale[i] = (int) pos.get(i);

        return playerScale;
    }

    public void setPlayerPosition(int[] playerPosition){
    }

    public void setPlayerRotation(int[] playerPosition){
    }

    public void setPlayerScale(int[] playerPosition){
    }
}

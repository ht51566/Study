package json_xml;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonParse01 {
    
    public static void main(String[] args) throws JSONException {
        String jsonString = "{\"title\": \"how to get stroage size\","
                + "\"url\": \"https://codechacha.com/ko/get-free-and-total-size-of-volumes-in-android/\","
                + "\"draft\": false,"
                + "\"star\": 10"
                + "}";
                
        //System.out.println(jsonString.charAt(0));
        JSONObject object = new JSONObject(jsonString);
        String title = object.getString("title");
        String url = object.getString("url");
        Boolean draft = object.getBoolean("draft");
        int star = object.getInt("star");
        
        System.out.println(title);
        System.out.println(url);
        System.out.println(draft);
        System.out.println(star);
    }
}

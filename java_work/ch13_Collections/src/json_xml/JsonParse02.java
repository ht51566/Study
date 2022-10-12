package json_xml;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParse02 {
    
    public static void main(String[] args) throws JSONException {
        String jsonString =
                "{"
                +   "\"posts\": ["
                +       "{"
                +           "\"title\": \"how to get stroage size\","
                +           "\"url\": \"https://codechacha.com/ko/get-free-and-total-size-of-volumes-in-android/\","
                +           "\"draft\": false"
                +       "},"
                +       "{"
                +           "\"title\": \"Android Q, Scoped Storage\","
                +           "\"url\": \"https://codechacha.com/ko/android-q-scoped-storage/\","
                +           "\"draft\": false"
                +       "},"
                +       "{"
                +           "\"title\": \"How to parse JSON in android\","
                +           "\"url\": \"https://codechacha.com/ko/how-to-parse-json-in-android/\","
                +           "\"draft\": true"
                +       "}"
                +   "]"
                +"}";
        
        JSONObject jObject = new JSONObject(jsonString);
        JSONArray jArray = jObject.getJSONArray("posts");
        
        for(int i = 0; i < jArray.length(); i++) {
            JSONObject object = jArray.getJSONObject(i);
            String title = object.getString("title");
            String url = object.getString("url");
            Boolean draft = object.getBoolean("draft");
            
            System.out.println("title(" + i + "): " + title);
            System.out.println("url(" + i + "): " + url);
            System.out.println("draft(" + i + "): " + draft);
            System.out.println("------------------------------");
        }
        
    }
}

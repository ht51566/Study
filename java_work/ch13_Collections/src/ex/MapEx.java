package ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("hong", 86);
        map.put("blue", 96);
        map.put("white", 92);
        System.out.println(map);

        String name = "";
        int maxScore = 0, totalScore = 0;
       
//        Set<Entry<String, Integer>> entry = map.entrySet();
//        for (Entry<String, Integer> en : entry) {
////           System.out.println(en.getKey());
////           System.out.println(en.getValue());
//            int score = en.getValue();
//           totalScore += score;
////           System.out.println(totalScore);
//           if (maxScore < score) {
//              maxScore = score;
//              name = en.getKey();
//           }
//        }
        
        System.out.println("-------------------------------");
        
        Set<String> set = map.keySet();
        System.out.println(set);
        Iterator<String> it = set.iterator();
        String maxName = "";
        while(it.hasNext()) {   
           name = it.next();
           int score = map.get(name);   
           totalScore += score;
                 
           if(maxScore < score ) {
              maxScore = score;
              maxName = name;
           }
        }  
        
        int avgScore = totalScore / map.size();
        System.out.println("평균점수: " + avgScore);
        System.out.println("최고점수: " + maxScore);
        System.out.println("최고점수를 받은 아이디: " + name);
        System.out.println("최고점수를 받은 아이디: " + maxName);
    }
}

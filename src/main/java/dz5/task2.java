package dz5;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < words1.length; i++) {
            if(map.containsKey(words1[i])) {
                map.put(words1[i], map.get(words1[i]) + 1);
            } else {
                map.put(words1[i], 1);
            }
        }

        for(int i = 0; i < words2.length; i++) {
            Integer repeat = map.get(words2[i]);

            if(repeat !=null && repeat <= 1) {
                map.put(words2[i], repeat - 1);
            }
        }

        int res = 0;
        for(Integer count : map.values()) {
            if(count == 0) {
                res+=1;
            }
        }
        return res;
    }
}

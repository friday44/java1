package dz5;

import java.util.HashMap;
import java.util.Map;

public class task3 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int pre = map.get(nums[i]);
                if(i - pre <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

package dz5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            if(map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int ans[] = new int[list.size()];
        int i = 0;
        for (int item : list) {
            ans[i++] = item;
        }
        return ans;
    }
}

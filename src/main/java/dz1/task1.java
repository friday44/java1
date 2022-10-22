package dz1;
// Given an integer array nums, move all 0's to the end
// of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.
// nums = new int[] {0,2,1,5,3,4};

public class task1 {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

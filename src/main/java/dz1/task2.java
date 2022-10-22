package dz1;
// Given an integer array nums and an integer val, remove
// all occurrences of val in nums in-place. The relative
// order of the elements may be changed.
//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]
public class task2 {
    public int removeElement(int[] nums, int val) {
        int copyInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                copyInd++;
            }
        }
        return copyInd;
    }
}

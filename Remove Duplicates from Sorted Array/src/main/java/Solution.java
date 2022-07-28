import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int duplicateCount = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]) {
                nums[i] = 101;
                duplicateCount++;
            }
        }

        Arrays.sort(nums);
        return nums.length - duplicateCount;
    }
}

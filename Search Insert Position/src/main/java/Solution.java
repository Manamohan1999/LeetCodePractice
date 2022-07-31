public class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchIndex(nums, target, 0, nums.length-1);
    }

    private int searchIndex(int[] nums, int target, int min, int max) {
        if(min <= max){
            int mid = (min + max)/2;
            if(nums[mid] == target)
                return mid;

            if(nums[mid] > target)
                return searchIndex(nums, target, min, mid-1);

            return searchIndex(nums, target, mid+1, max);
        }else{
            return min;
        }
    }
}

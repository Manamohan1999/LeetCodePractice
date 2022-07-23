import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        int[] arr = new Solution().twoSum(nums, 0);

        System.out.println(Arrays.toString(arr));
    }
}

public class Solution {
    public int climbStairs(int n) {
        int current = 1;
        int next = 1;
        for (int i = 2 ; i <= n ; i++){
            int temp = current;
            current = next;
            next += temp;
        }
        return next;
    }
}

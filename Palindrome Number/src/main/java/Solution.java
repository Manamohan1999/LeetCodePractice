public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        String input = String.valueOf(x);
        String output = new StringBuilder(input).reverse().toString();
        if(input.equals(output)){
            return true;
        }
        return false;
    }
}

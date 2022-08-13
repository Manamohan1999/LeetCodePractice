import java.util.Arrays;

public class Solution {
    public String addBinary(String a, String b) {
//        return Long.toBinaryString(Long.parseLong(a, 2) + Long.parseLong(b, 2));
//        System.out.println(Arrays.toString(a.split("")));

        //initialize the result string
        StringBuilder result = new StringBuilder("");

        //initialize the digit sum bit
        int sum = 0;

        int i = a.length()-1, j = b.length()-1;
        while(i >= 0 || j >= 0 || sum == 1){
            //get the sum of last digits
            sum += (i >= 0) ? (a.charAt(i) - '0') : 0;
            sum += (j >= 0) ? (b.charAt(j) - '0') : 0;

            //append the sum to the result string
            result.append((char)(sum % 2 + '0'));

            //calculate the carry bit
            sum /= 2;

            i--;j--;
        }
         return result.reverse().toString();
    }
}

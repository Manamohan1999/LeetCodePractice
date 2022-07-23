public class Solution {
    public int romanToInt(String s) {
        int output = 0;
        for (int i = 0 ; i< s.length(); i++){
            int value = RomanSymbol.valueOf(String.valueOf(s.charAt(i))).value;
            if(i< s.length()-1) {
                int nextValue = RomanSymbol.valueOf(String.valueOf(s.charAt(i+1))).value;
                if(value < nextValue){
                    output += (nextValue - value);
                    i++;
                    continue;
                }
            }
           output += value;
        }
        return output;
    }
}



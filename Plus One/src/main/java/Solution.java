import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag = false;
        if (digits[digits.length - 1] == 9) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if(flag){
                    break;
                }else {
                    if (digits[i] + 1 > 9 && (i - 1) >= 0) {
                        digits[i] = 0;
                    } else {
                        digits[i] += 1;
                        flag = true;
                    }
                }
            }
        } else {
            digits[digits.length - 1] += 1;
        }
        return Arrays.stream(Arrays.stream(digits)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining()).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

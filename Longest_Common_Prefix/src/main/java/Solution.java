public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder("");

        for(int i = 0; i<lowestSizeString(strs); i++){
            char temp = strs[0].charAt(i);
            boolean isContains = true;

            for(int j = 1; j < strs.length; j++){
                if(isContains)
                    if(temp != strs[j].charAt(i))
                        isContains = false;
            }

            if(isContains)
                commonPrefix.append(temp);
            else
                return commonPrefix.toString();
        }

        return commonPrefix.toString();
    }

    private int lowestSizeString(String[] strs){
        int size = strs[0].length();
        for(String str : strs){
            if(str.length() <= size){
                size = str.length();
            }
        }
        return size;
    }
}

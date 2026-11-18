import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            String s = strArr[i];
            if (!s.contains("ad")) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}
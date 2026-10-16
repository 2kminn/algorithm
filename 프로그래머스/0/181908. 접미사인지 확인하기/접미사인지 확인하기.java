class Solution {
    public int solution(String my_string, String is_suffix) {
        int strlen = my_string.length();
        int suflen = is_suffix.length();
        if (strlen < suflen) {
            return 0;
        }
        
        return my_string.substring(strlen - suflen)
                        .equals(is_suffix) ? 1 : 0;
    }
}
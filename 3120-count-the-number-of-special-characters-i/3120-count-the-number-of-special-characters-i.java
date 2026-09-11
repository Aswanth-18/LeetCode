class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch >='a' && ch<='z'){
                set.add(ch);
            }
        }
        int cnt=0;
        int found=0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch >='A' && ch<='Z' && set.contains(Character.toLowerCase(ch))){
                cnt++;
                set.remove(Character.toLowerCase(ch));
            }
        }
        return cnt;
    }
}
class Solution {
    public int numberOfSpecialChars(String word) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                map.put(ch, i);
            }
        }

        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {

                char lowerCase = Character.toLowerCase(ch);

                if (map.containsKey(lowerCase) && map.get(lowerCase) < i) {
                    map.remove(lowerCase);
                    cnt++;
                } else if (map.containsKey(lowerCase) && map.get(lowerCase) > i) {
                    map.remove(lowerCase);
                }
            }
        }
        return cnt;
    }
}
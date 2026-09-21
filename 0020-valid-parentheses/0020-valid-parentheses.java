class Solution {
    public boolean isValid(String s) {
        // Stack<Character> s1 = new Stack<>();

        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     if (c == '(') {
        //         s1.push(')');
        //     } else if (c == '[') {
        //         s1.push(']');
        //     } else if (c == '{') {
        //         s1.push('}');
        //     } else {
        //         if (s1.isEmpty() || s1.pop() != c) {
        //             return false;
        //         }
        //     }
        // }
        // return s1.isEmpty();

        Stack<Character> s1 = new Stack<>();
        Map <Character,Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                s1.push(c);
            }
            else{
                if(s1.isEmpty()) return false;
                char top = s1.pop();

                if(c!=map.get(top)) return false;
            }
        }
        return s1.isEmpty();
    }
}
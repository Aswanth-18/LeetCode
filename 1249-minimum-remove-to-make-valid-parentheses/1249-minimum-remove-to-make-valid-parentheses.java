class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
                str.append(ch);
            }
            else if(ch == ')'){
                if(!st.isEmpty()){
                    st.pop();
                    str.append(ch);
                }
            }
            else{
                str.append(ch);
            }
        }
        for(int i=str.length()-1;i>=0;i--){
            if(!st.isEmpty() && str.charAt(i) == '('){
                str.deleteCharAt(i);
                st.pop();
            }
        }
        return str.toString();
    }
}
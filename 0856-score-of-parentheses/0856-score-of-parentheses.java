class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(0);
            }
            else{
                
                int innerPara = st.pop();
                int score =0;

                if(innerPara == 0 ){
                    score = 1;
                }
                else{
                    score = 2*innerPara;
                }
                st.push(st.pop()+score);
            }
        }
        return st.pop();
    }
}
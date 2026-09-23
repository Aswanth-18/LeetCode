class Solution {
    public String removeOuterParentheses(String s) {
        // Stack<Character> st = new Stack<>();
        // StringBuilder innerPara = new StringBuilder();

        // for(int i = 0 ;i < s.length() ; i++){
        //     char ch = s.charAt(i);
        //     if(ch == '('){
        //         st.push(ch);
        //         if(st.size()>1) innerPara.append(ch);
        //     }
        //     else{
        //         if(ch==')' && st.size()>1){   
        //             innerPara.append(ch);
        //         }
        //          st.pop();
        //     }
        // }
        // return innerPara.toString();
        int inner = 0;
        StringBuilder para = new StringBuilder();

        for(int i=0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                inner++;

                if(inner>1) para.append(ch);
            }
            else{
               if(ch==')' && inner>1){   
                    para.append(ch);
                }
                inner--;
            }
        }
        return para.toString();
    }
}
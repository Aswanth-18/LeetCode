class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();

        for (var i : tokens) {
            switch (i) {
                case "+":
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a + b);
                    break;
                case "-":
                    a = st.pop();
                    b = st.pop();
                    st.push(b - a);
                    break;
                case "*":
                    a = st.pop();
                    b = st.pop();
                    st.push(a * b);
                    break;
                case "/":
                    a = st.pop();
                    b = st.pop();
                    st.push(b / a);
                    break;

                default:
                    st.push(Integer.parseInt(i));

            }
        }
        return st.pop();
    }
}
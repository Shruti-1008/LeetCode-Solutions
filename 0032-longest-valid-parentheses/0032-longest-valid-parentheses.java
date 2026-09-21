class Solution {
    public int longestValidParentheses(String s) {
        int maxarea=0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push(i);
            }
            else {
                stk.pop();
                if(stk.isEmpty()){
                    stk.push(i);
                }
                else {
                    maxarea=Math.max(maxarea,i-stk.peek());


                }
                
              
            }
        }
        return maxarea;
        
        
    }
}
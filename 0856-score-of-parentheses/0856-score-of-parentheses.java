class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk=new Stack<>();
        int score=0;
        for(char c:s.toCharArray()){
            if(c == '('){
                stk.push(score);
                score=0;
            }
            else {
                score=stk.pop() + Math.max(1,score*2);
            
            }



        }
        return score;
        
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> Stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
                Stack.push(s.charAt(i));
            }
            else {
                if(Stack.isEmpty()){
                    return false;
                }

                if(s.charAt(i)=='}' && Stack.pop()!='{' || s.charAt(i)==')' && Stack.pop()!='(' || s.charAt(i)==']' && Stack.pop()!='[') {
                    return false;
                }
              
            }
        }
        return Stack.isEmpty();
        
    }
}
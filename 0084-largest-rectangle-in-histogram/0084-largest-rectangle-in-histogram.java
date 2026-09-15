class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> stk = new Stack<>();
        int maxarea=0,element=0;
        int nse=0,pse=0;
        for(int i=0; i<heights.length;i++){
            while(!stk.isEmpty() && heights[stk.peek()]>heights[i]){
                element = stk.pop();
                nse=i;
                pse = stk.isEmpty() ? -1 : stk.peek();
                maxarea=Math.max(maxarea,heights[element]*(nse-pse-1));
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            nse = n;
            element = stk.pop();
            pse = stk.isEmpty() ? -1 : stk.peek();
            maxarea=Math.max(maxarea, heights[element]*(nse-pse-1));
        }
        return maxarea;
    }
}
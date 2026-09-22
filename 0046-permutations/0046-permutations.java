class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;
        boolean[] freq = new boolean[n];
        backtrack(new ArrayList<>(), freq,res,nums);
        return res;
        
    }
    public void backtrack(List<Integer> ls, boolean[] freq,List<List<Integer>> res,int[] nums){
        if(ls.size()==nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int i=0; i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ls.add(nums[i]);
                backtrack(ls,freq,res,nums);
                freq[i]=false;
                ls.remove(ls.size()-1);
            }
        }

    }
}
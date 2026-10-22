class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[][] dp = new int[n+1][n+1];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        int[] prefix = new int[stoneValue.length];
        prefix[0] = stoneValue[0];
        for(int i=1;i<n;i++){
            prefix[i]= prefix[i-1]+stoneValue[i];
        }
        return helper(stoneValue,0,stoneValue.length-1,prefix,dp);
    }
    public int helper(int[]nums,int l,int r,int[]prefix,int[][]dp){
        int ttl = 0;
        if(dp[l][r]!=-1) return dp[l][r];
        if(l<0 || l>=nums.length || r<0 || r>=nums.length) return 0;
        if(l>0) ttl = prefix[r]-prefix[l-1];
        else ttl = prefix[r];
        int left = 0;
        int right = 0;
        int sum = 0;
        for(int i=l;i<=r;i++){
            sum += nums[i];
            ttl -= nums[i];
            if(ttl>sum){
                left = Math.max(left,sum+helper(nums,l,i,prefix,dp));
            }else if(sum>ttl) {
                right = Math.max(right, ttl + helper(nums,i+1,r,prefix,dp));
            }else{
                left = Math.max(left, sum + helper(nums,l,i,prefix,dp));
                right = Math.max(right, ttl + helper(nums,i+1,r,prefix,dp));
            }
        }
        return dp[l][r] = Math.max(left,right);
    }
}
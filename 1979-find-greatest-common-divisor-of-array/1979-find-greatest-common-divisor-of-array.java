class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int num1 = nums[0];
        int num2 = nums[n-1];
        return gcd(num1,num2);
    }
    public int gcd(int num1,int num2)
    {
        for(int i = num1;i>=1;i--)
            {
                if(num1 % i == 0 && num2 % i == 0)return i;
            }
        return 1;
    }
}
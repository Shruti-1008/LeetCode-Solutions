class Solution {
public:
    int digitSum(int num){
        int temp = num;

        int sum = 0;

        while(temp){
            int digit = temp%10;
            sum = sum + digit;
            temp = temp/10;
        }

        return sum;
    }


public:
    int smallestIndex(vector<int>& nums) {
        int n = nums.size();

        for(int i = 0; i<n; i++){
            if(i == digitSum(nums[i])){
                return i;
            }
        }
        
        return -1;
    }
};
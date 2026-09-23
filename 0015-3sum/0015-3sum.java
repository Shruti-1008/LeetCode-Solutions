class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            int l = i + 1;
            int right = nums.length - 1;
            while (l < right) {
                int sum = nums[i] + nums[l] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[right]));
                    l++;
                    right--;
                } else if (sum < 0) {
                    l++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
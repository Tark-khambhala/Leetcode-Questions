class Solution {
    public int missingInteger(int[] nums) {
        int sum = 0;
        int i = 0;
        while ((i < nums.length - 1) && (nums[i] == nums[i + 1] - 1)) {
            sum += nums[i];
            i++;
        }
        sum += nums[i];
        Arrays.sort(nums);

        while (i < nums.length) {
            if (nums[i] == sum) {
                sum++;
            }
            i++;
        }
        return sum;
    }
}
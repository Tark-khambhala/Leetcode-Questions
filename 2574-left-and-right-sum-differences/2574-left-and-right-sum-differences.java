class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            int leftsum = 0, rightsum = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    rightsum += nums[j];
                }
            
                for (int j = i - 1; j >= 0; j--) {
                    leftsum += nums[j];
                }
            
            int diff = leftsum - rightsum;
            if (diff < 0) {
                diff *= -1;
            }
            arr[x++] = diff;
        }
        return arr;
    }
}
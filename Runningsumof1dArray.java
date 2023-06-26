class Solution {
    public int[] runningSum(int[] nums) {
        int sum =0;
        int count = 0;
        for(int i =0 ;i<nums.length;i++){
            sum = sum + nums[i];
            nums[count++] = sum;
        }
        return nums;
        
    }
}

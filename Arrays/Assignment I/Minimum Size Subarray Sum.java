class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length;
        int j = 0,sum = 0;
        
        for(int i = 0; i < nums.length; ++i){
            sum += nums[i];
            while(sum >= target){
                sum -= nums[j];
                min = Math.min(i-j+1,min);
                j++;
            }
            
        }
        
        if(j == 0 && sum < target) return 0;
        return min;
    }
}

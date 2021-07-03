class Solution {
  public int[] searchRange(int[] nums, int target) {
        return new int[]{find(nums,target,true),find(nums,target,false)};
    }
    
    private int find(int[] nums,int target,boolean first){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        
        while (low <= high){
            int mid = (low + high)/2;
            
            if(nums[mid] == target){
                ans = mid;
                if(!first) low = mid+1;
                else high = mid-1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}
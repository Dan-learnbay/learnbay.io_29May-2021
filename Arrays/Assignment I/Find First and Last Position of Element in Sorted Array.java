class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = -1, l = -1;
        int i = 0, j = nums.length-1;
        
        while(i <= j){
            int mid = i + (j-i)/2;
            if(nums[mid] == target && (mid == 0 || nums[mid] != nums[mid-1])){
                f = mid; 
                break;
            }
            if(nums[mid] >= target){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        
        if(f != -1){
            i = 0; j = nums.length-1;
            while(i <= j){
                int mid = i + (j-i)/2;
                if(nums[mid] == target && (mid == nums.length-1 || nums[mid] != nums[mid+1])){
                    l = mid; 
                    break;
                }
                if(nums[mid] > target){
                    j = mid-1;
                }else{
                    i = mid+1;
                }
            }
        }
        
        return new int[]{f,l};
    }
}

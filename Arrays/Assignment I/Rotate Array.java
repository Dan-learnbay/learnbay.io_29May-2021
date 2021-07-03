class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0 || nums.length < 2) return;
        
        int arr[] = nums.clone();
        int len = nums.length;
        k %= len;
        
        for(int i = 0; i < arr.length; ++i){
            nums[i] = arr[(i-k+len)%len];
        }
    }
}

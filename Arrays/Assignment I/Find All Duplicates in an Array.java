class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; ++i){
            int j = Math.abs(nums[i])-1;
            if(j < nums.length && nums[j] < 0){
                list.add(j+1);
            }else if( j < nums.length){
                nums[j] *= -1;
            }
        }
        
        return list;
    }
}

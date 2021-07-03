class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i < j){
            max = Math.max((j-i) * Math.min(height[i],height[j]),max);
            if(height[i] < height[j]){
                ++i;
            }else{
                --j;
            }
        }
        
        return max;
    }
}

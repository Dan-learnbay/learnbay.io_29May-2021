class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n-k+1];
        int idx = 0;
        
        Deque<Integer> dq = new LinkedList<>();
        
        for(int i = 0; i < nums.length; ++i){
            while(!dq.isEmpty() && dq.peek() < i-k+1){
                dq.poll();
            }
            
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            
            dq.offer(i);
            
            if(i >= k-1){
                arr[idx++] = nums[dq.peek()];
            }
        }
        
        return arr;
    }
}
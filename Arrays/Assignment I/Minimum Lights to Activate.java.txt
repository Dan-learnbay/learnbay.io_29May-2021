public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        if(B > A.size()){
            if(A.indexOf(1) != -1) return 1;
            return -1;
        }
        int prev = 0;
        int max = 0;
        int cur = B-1;
        int ans = 0;
        while(max < A.size()-1){
            while(A.get(cur) != 1){
                if(cur == 0 || cur == prev+1) return -1;
                --cur;
            }
            ++ans;
            prev = cur;
            max = cur+B-1;
            cur = Math.min(A.size()-1,max+B);
        }
        
        return ans;
    }
}

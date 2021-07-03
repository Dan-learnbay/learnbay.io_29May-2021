class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int i = arr.length-1;
        int idx = arr.length-2;
        
        while(idx >= 0 && arr[idx] <= arr[idx+1]) --idx;
        
        if(idx < 0) return arr;
        
        while((i > 0 && arr[i] == arr[i-1]) || arr[i] >= arr[idx]){
            --i;
        }
        
        swap(idx,i,arr);
        
        return arr;
    }
    
    public void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //1 9 4 6 7 
}

/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int arr[] = {2, 1, 1, 1, 4, 5};
		System.out.println(subarrayWithGivenSum(arr,4));
	}
	
	public static int subarrayWithGivenSum(int arr[], int target){
	    int ans = 0;
	    int j = 0;
	    int prod = 1;
	    for(int i = 0; i < arr.length; ++i){
	        prod *= arr[i];
	        if(prod == target){
	            ++ans; continue;
	        }
	        while(j < arr.length && prod >= target){
	            if(prod == target) ++ans;
	            prod /= arr[j++];
	        }
	        
	    }
	    
	    if(prod == target){
	        prod /= arr[j];
	        while(j < arr.length && prod >= target){
	            if(prod == target) ++ans;
	            prod /= arr[j++];
	        }
	    }
	    
	    return ans;
	}
}

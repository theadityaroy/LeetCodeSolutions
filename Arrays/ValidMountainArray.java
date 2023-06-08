// 941. Valid Mountain Array : https://leetcode.com/problems/valid-mountain-array/

class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }

        int peak = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                peak = i;
                break;
            }
            
        }

        if(arr[1] == arr[peak] || peak-1 == arr.length - 1){
            return false;
        }

        for(int i = 1; i < peak; i++){
            if(arr[i-1] >= arr[i]){
                return false;
            }
        }

        for(int i = peak + 1; i < arr.length; i++){
            if(arr[i-1] <= arr[i]){
                return false;
            }
        }
        return true;
    }
}

// Time Complexity : O(N)
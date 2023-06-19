// 1200. Minimum Absolute Difference : https://leetcode.com/problems/minimum-absolute-difference/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            minDiff = Math.min(arr[i] - arr[i-1], minDiff);
        }

        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] == minDiff){
                List<Integer> temp = new ArrayList<>(2);
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                list.add(temp);
            }
        }
        return list;
    }
}

// Time Complexity : O(N*LogN)
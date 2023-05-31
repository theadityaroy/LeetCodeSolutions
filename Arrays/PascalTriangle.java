// 118. Pascal's Triangle : https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows <= 0){
            return triangle;
        }

        for(int i = 0; i < numRows; i++){
            List<Integer> row =  new ArrayList<Integer>();
            for(int j = 0; j < i+1; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}

// Time Comlexity : O(N2)
// Space Complexity : O(N2)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows <= 0){
            return triangle;
        }

        for(int i = 1; i <= numRows; i++){
            int c = 1;
            List<Integer> row =  new ArrayList<Integer>();
            for(int j = 1; j <= i; j++){
                row.add(c);
                c = (c * (i-j)) / j;                
            }
            triangle.add(row);
        }
        return triangle;
    }
}

// Time Comlexity : O(N2)
// Space Complexity : O(1)
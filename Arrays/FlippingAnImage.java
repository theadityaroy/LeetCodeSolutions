// 832. Flipping an Image : https://leetcode.com/problems/flipping-an-image/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            int start = 0;
            int end = image[0].length - 1;
            while(start <= end){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;

                // INVERT THE LAST MID ELEMENT WHEN START == END:
                if(start == end){
                    image[i][start] = 1 - image[i][start];
                    break;
                }

                // INVERT THE ELEMENT FROM START :
                image[i][start] = 1 - image[i][start];

                // INVERT THE ELEMENT FROM END :
                image[i][end] = 1 - image[i][end];

                // ITERATE START++ AND END-- :
                start++;
                end--;
            }
        }
        return image;
    }
}

// Time Complexity : O(N^2)
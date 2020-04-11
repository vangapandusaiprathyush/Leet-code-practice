// Language: Java
class NumArray {

    int[] dpArray;
    public NumArray(int[] nums) {
        
       int n = nums.length;
       dpArray = new int[n+1];
       dpArray[0] = 0;
         for(int p = 1; p<=n; p++){
             dpArray[p] = dpArray[p-1] + nums[p-1];
         }
    }
    
    public int sumRange(int i, int j) {
        return dpArray[j+1]-dpArray[i];
    }
}

/*
               0  1  2   3  4   5
nums array : [-2, 0, 3, -5, 2, -1]


            0  1  2 3  4  5  6
dpArray : [ 0 -2 -2 1 -4 -2 -1 ]


Nums array complexity - O(n) (runs only once and creates DP Array)
DP Array complexity - O(1) ( for given method call)
Space Complexity - O(n)  ( new dp array takes same as size of nums array + 1)
*/

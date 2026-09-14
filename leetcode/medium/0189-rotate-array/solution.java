class Solution {
    public void rotate(int[] nums, int k) {
        //Method-1-Brute force:-
    //    int n = nums.length;
    //    k = k%n;
    //    for(int step = 0;step<k;step++){
    //     int temp = nums[n-1];
    //     for(int i=n-1;i>0;i--){
    //         nums[i]=nums[i-1];
    //     }
    //     nums[0]=temp;
    //    } 
    ////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////
    //Method-2-Auxillary array placement
    int n = nums.length;
    int[] tempArray = new int[n];
    for(int i=0;i<n;i++){
        int futureindex = (i+k)%n;
        tempArray[futureindex] = nums[i];
    }
    for(int i=0;i<n;i++){
        nums[i] = tempArray[i];
    }
    
    }
}
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
    // int n = nums.length;
    // int[] tempArray = new int[n];
    // for(int i=0;i<n;i++){
    //     int futureindex = (i+k)%n;
    //     tempArray[futureindex] = nums[i];
    // }
    // for(int i=0;i<n;i++){
    //     nums[i] = tempArray[i];
    // }
    //////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////

    //Method-3:-The reversal Algorithm
    int n = nums.length;
    if (nums == null || nums.length == 0) {
            return;
        }
    k = k % n;
    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);
    }

    private void reverse(int[] nums,int start,int end){
        while(start<end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end]=  temp;
        start++;
        end--;
        }
    }
    }

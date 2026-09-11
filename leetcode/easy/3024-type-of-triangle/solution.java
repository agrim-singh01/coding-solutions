class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if(nums == null || nums.length != 3){
            return "none";
        } 
        //triangle inequality theorem
        if(a+b<=c || b+c<=a || a+c<=b){
            return "none";
        }
        if(a==b && a==c){
            return "equilateral";
        }else if(a!=b && a!=c && b!=c){
            return "scalene";
        }else{
            return "isosceles";
        }
        
       
    }
}
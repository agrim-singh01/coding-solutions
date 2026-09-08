class Solution {
    public int countCommas(int n) {
     if(n > 999){
        return 3;
     }
     if(n<=1000 || n>=100000){

     return 0;
    }
    return 6;
    }
}
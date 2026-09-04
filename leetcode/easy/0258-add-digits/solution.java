class Solution {
    public int addDigits(int n) {
        int sum = 0;
        if(n == 0){
            sum = 0;
        }
        while(n > 9){
            sum = 0;
   while(n > 0){
            int digit = n % 10;
            sum+=digit;
            n /= 10;  
        }
        n = sum;
        }
     
        return sum;
    }
}
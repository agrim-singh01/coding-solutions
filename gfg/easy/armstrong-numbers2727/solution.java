class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int originalnum = n;
        int temp = n;
        int digits= 0;
        int sum = 0;
        
        while(temp > 0){
            digits++;
            temp /= 10;
        }
        while(n > 0){
            int digit = n % 10;
            int power = 1;
            for(int i=0;i<digits;i++){
                power=power*digit;
            }
            sum = sum+power;
            n /= 10;
        }
        return sum == originalnum;
    }
}
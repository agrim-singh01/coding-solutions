class Solution {
    public long countCommas(long n) {
        long comma = 0;
        long threshold = 1000;

        while(threshold<=n){
            comma = comma + (n - threshold) + 1;
            if(n > Long.MAX_VALUE/1000){
                break;
            }
            threshold*=1000;
        }
        
        
        return comma;
        
        
    }
}
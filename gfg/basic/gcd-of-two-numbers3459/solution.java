class Solution {
    static int gc(int a,int b){
        if(b==0) return a;
        return gc(b,a%b);
    }
    public static int gcd(int a, int b) {
   return gc(a,b);
        
    }
}

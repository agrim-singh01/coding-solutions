class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;

        int ans=-1;
        
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(letters[mid]>target){
                right = mid -1;
                ans = mid;
            }else{
                left=mid+1;
            }
        }
        if(ans == -1){
            return letters[0];
        }else{
           return letters[ans];
        }
    }
}
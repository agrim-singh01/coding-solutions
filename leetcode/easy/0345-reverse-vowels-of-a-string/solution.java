class Solution {
    public String reverseVowels(String s) {
        char arr[] = new char[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i);
        }
        int left = 0;
        int right = arr.length-1;
        String vowel = "AEIOUaeiou";

        while(left<right){
            while(left<right && vowel.indexOf(arr[left]) == -1){
                left++;
            }
            while(left<right && vowel.indexOf(arr[right]) == -1){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;;
        }
        return new String(arr);
    }
}
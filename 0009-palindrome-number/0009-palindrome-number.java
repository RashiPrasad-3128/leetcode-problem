class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;
        while(x> 0){
            int last = x % 10;
            rev = rev* 10+last;
            x/= 10;
        }
        return rev == n;
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int m=x;
        int rev=0;
        while(m!=0){
            int d=m%10;
            rev=rev*10+d;
            m=m/10;
        }
        if(rev==x) return true;
        else return false;
    }
}
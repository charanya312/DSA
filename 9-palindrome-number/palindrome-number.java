class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long m=x;
        long rev=0;
        while(m!=0){
            int rem=(int) (m%10);
            rev=rev*10+rem;
            m=m/10;
        }
        return (rev==x);
    }
}
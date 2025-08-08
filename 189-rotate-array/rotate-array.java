class Solution {
    public void rotate(int[] a, int k) {
        k=k%a.length;
       reverse(a,0,a.length-1);
       reverse(a,0,k-1);
       reverse(a,k,a.length-1);
    }
    private void reverse(int[] a,int left,int right){
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
}
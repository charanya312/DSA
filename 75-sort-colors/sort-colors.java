class Solution {
    public void sortColors(int[] nums) {
        int p1 = 0;
        int p3 = 0;
        int p2 = nums.length - 1;
        while(p3 <= p2){
            if(nums[p3]==0){
                int temp = nums[p1];
                nums[p1] = nums[p3];
                nums[p3] = temp;
                p1++;
                p3++;
            }
            else if(nums[p3]==1){
                p3++;
            }
            else{
                int temp = nums[p3];
                nums[p3] = nums[p2];
                nums[p2] = temp;
                p2--;
            }
        }
    }
}
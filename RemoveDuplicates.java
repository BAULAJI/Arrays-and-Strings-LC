class Solution {
    public int removeDuplicates(int[] nums) {
      
        int r=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]='z';
                r++;
            }
        }
       Arrays.sort(nums);
        int n=nums.length-r;
        return n;
    }
}

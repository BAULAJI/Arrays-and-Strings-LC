class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                nums[i]='_';
                c++;
            }
        }
        Arrays.sort(nums);
        int len=(nums.length-c);
        return len;
    }
}

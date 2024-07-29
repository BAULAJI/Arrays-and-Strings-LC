class Solution {
    public int removeDuplicates(int[] nums) {
       
        int n=nums.length;
        int tot=0;
        for(int i=0;i<n;i++)
        {    
            int c=0;
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                   c++; 
                }
            }
            if(c>=2)
            {
                nums[i]='_';
                tot++;
            }
        }
        Arrays.sort(nums);
        return nums.length-tot;
    }
}

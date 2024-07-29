class Solution {
    public int searchInsert(int[] nums, int target) {
       int s=0;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                s=i;
                break;
            }  
            else if(target>nums[nums.length-1])
            {
              s=nums.length;
                break;
            } 
            else
            {
              for(int j=0;j<nums.length;j++)
              {
                    if(target<nums[j])
                    {
                        s=j;
                        break;
                    }
              }
            }
        }
        return s;
    }
}

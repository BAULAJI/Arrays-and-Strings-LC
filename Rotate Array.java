class Solution {
    static void reverse(int []nums,int i,int j)
    {
        while(i<=j)
        {
         int  temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
       k=k%nums.length;
        int n=nums.length;
            reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}

class Solution {
    public int romanToInt(String s) {
        String sp[]=s.split("");
        int ans=0,num=0,prev=0;
        for(int i=sp.length-1;i>=0;i--)
        {
            switch(sp[i])
            {
                case "I":
                {
                     num=1;   
                    break;
                }
                case "V":
                {
                    num=5;
                    break;
                }
                case "X":
                {
                    num=10;
                    break;
                }
                case "L":
                {
                     num=50;  
                    break;
                }
                case "C":
                {
                     num=100; 
                    break;
                }
                case "D":
                {
                   num=500; 
                    break;
                }
                case "M":
                {
                     num=1000;
                    break;
                }  
            }
            if(num<prev)
            {
                ans=ans-num;
            }
            else
                ans+=num;
            prev=num;
            
        }
        return ans;
      
    }
}

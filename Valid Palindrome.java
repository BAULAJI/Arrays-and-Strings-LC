class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        s=s.toLowerCase();
        char ch[]=s.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isAlphabetic(ch[i])||Character.isDigit(ch[i]))
            {
                ans=ans+ch[i];
            }
        }
        
        String st=ans;
        StringBuilder sb=new StringBuilder(ans);
        sb.reverse();
        if((sb.toString()).equals(st))
        return true;
        return false;
    }
}

class Solution {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp[]=new Boolean[s.length()];
        HashSet<String> cache = new HashSet(wordDict);
        return wordBreakRecursion( s, cache,0,dp);
    }
    
    
    public boolean wordBreakRecursion(String s , Set<String> cache, int index, Boolean dp[]){
        
        int n = s.length();
        
        if(index>=n)
            return true;
        
        if(dp[index]!=null)
            return dp[index];
        
        for(int i= index+1;i<=n;i++){
           // System.out.println(index+" -- i "+i +"  n "+n +" end"+(i-index)+" String "+s);
            if(cache.contains(s.substring(index,i)) && wordBreakRecursion(s,cache,i,dp)){
                dp[index]=true;
                return true;
            }
        }
        
        return dp[index]=false;
    }
}

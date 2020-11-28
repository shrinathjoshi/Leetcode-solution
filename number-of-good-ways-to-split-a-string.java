class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        int result =0;
        
        Set<Character> uniqueElements = new HashSet<Character>();
        
        for(int i =0;i<n;i++){
            char currentChar =  s.charAt(i);
            uniqueElements.add(currentChar);
            leftSum[i]=uniqueElements.size();
        }
    
        
        uniqueElements = new HashSet<Character>();
        
        for(int i =n-1;i>0;i--){
            char currentChar =  s.charAt(i);
            uniqueElements.add(currentChar);
            rightSum[i]=uniqueElements.size();
        }
    
        for(int i =0;i<n-1;i++){
            if(leftSum[i]==rightSum[i+1])
                result++;
        }
        
        return result;
    }
}

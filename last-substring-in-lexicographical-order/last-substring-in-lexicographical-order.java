class Solution {
    public String lastSubstring(String s) {
        int n = s.length();
        int left=0;
        int right=1;
        int offset = 0;
        
        while(right+offset<n){
            
            if(s.charAt(left+offset) == s.charAt(right + offset)){
                offset++;
            }
            else if(s.charAt(left+offset) < s.charAt(right + offset)){
                left = Math.max(left+offset+1,right);
                offset=0;
                right=left+1;
            }else {
                right+=offset+1;
                offset=0;
            }
        }
        
        return s.substring(left);
        
    }
}
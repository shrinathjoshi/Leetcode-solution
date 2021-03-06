class Solution {
    public int[][] merge(int[][] intervals) {
        
        
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<int[]> merged = new ArrayList<int []>();
        int current[] = intervals[0]; 
        merged.add(current);
        
        
        for(int[] interval: intervals){
            
            if(interval[0]<=current[1]){
                current[1]=Math.max(interval[1],current[1]);
            }else
            {
                current = interval;
                merged.add(current);
            }
            
        }
       
        return merged.toArray(new int[merged.size()][]);
    }
}

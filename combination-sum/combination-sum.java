class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result =  new ArrayList<>();
        List<Integer> partialSolution =  new ArrayList<>();
        Arrays.sort(candidates);
        generateCombinationSum(0,0,result,partialSolution,target,candidates);
        
        return result;
    }
    
    
    public void generateCombinationSum(int index,int currentSum, List<List<Integer>> result, List<Integer>partialSolution,int target, int candidates[]) {
        
        //Condition when are partialSolution is actually Solution
        if(currentSum == target){
            result.add(new ArrayList<>(partialSolution));
            return;
        }
        
        if(index>candidates.length || currentSum > target)
            return ;
        
        
        //Generate all the valid candiates
        for(int i =index;i<candidates.length;i++){
        
            if(i>0 && candidates[i] == candidates[i-1])
                continue;
            
            //Adding one candiate to the partial Solution
            partialSolution.add(candidates[i]);
        
            //Recursively call your function with the updated partial Solution
            generateCombinationSum(i,currentSum+candidates[i],result,partialSolution,target,candidates);
                
            //Remove the previously added candidate from the partial Solution and backtrack    
            partialSolution.remove(partialSolution.size()-1);
        }
        
    }
        
    
}

class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> result =  new ArrayList<>();
        generateLetterCasePermutation(0,"",result,S);
        return result;
    }
    
    private void generateLetterCasePermutation(int index, String partialSolution, List<String> result,String S){
        
        
        if(partialSolution.length() == S.length()){
            result.add(partialSolution);
            return;
        }
        
        char currentCharacter = S.charAt(index);
        if(Character.isAlphabetic(currentCharacter)){
                      generateLetterCasePermutation(index+1,partialSolution+Character.toLowerCase(currentCharacter),result,S);          generateLetterCasePermutation(index+1,partialSolution+Character.toUpperCase(currentCharacter),result,S);
  
        }
        else
            generateLetterCasePermutation(index+1,partialSolution+currentCharacter,result,S);
    }
}
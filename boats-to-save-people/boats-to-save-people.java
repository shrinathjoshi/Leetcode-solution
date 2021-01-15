class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int n = people.length;
        int left = 0;
        int right = n-1;
        int boats =0;
        
        while(right>=0 && people[right]>=limit)
        {
            boats++; right--;
        }
        
        while(left<=right){
            if(people[left]+people[right] <=limit){
                boats++;
                left++;
                right--;
            }
            else{
                right--;
                boats++;
            }
            
        }
        
        return boats;
    }
}

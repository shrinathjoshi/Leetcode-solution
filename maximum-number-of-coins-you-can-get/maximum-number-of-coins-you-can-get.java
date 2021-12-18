class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        int n = piles.length;
        int steps = n/3;
        int result=0;
        for(int i = n-2;i>=0 && steps>0;i=i-2,steps--){
               result+=piles[i];
        }
        
        return result;
    }
}

//  2,4,1,2,7,8
//  1,2,2,4,7,8

//(1,7,8) (2,2,4)

//9,8,7,6,5,1,2,3,4
//1,2,3,4,5,6,7,8,9

//(1,8,9) (2,6,7) (3,4,5)
// 8 + 6 + 4 = 18
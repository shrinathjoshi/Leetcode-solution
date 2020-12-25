class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int direction=0;
        int row = matrix.length;
        if(row == 0) return new int[0];
        int column = matrix[0].length;
        int result[] = new int [row*column];
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                int sum =i+j;
                if(!map.containsKey(sum)){
                    map.put(sum,new ArrayList<Integer>());
                }
                map.get(sum).add(matrix[i][j]);
            }
        }        
        
        int index=0;
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet())
        {
            List<Integer> tempList = new ArrayList<>();
            if(entry.getKey()%2==0){
                List<Integer> values = entry.getValue();
                Collections.reverse(values);
                tempList = values;
            }

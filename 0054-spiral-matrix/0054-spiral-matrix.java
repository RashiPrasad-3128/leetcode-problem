class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> arr=new ArrayList<>(); 
      int sc=0;
      int ec=matrix[0].length-1;  
      int sr=0;
      int er=matrix.length-1;
      while(sc<=ec && sr<=er){
         for(int i=sc;i<=ec;i++){
           arr.add (matrix[sr][i]);
            
         }
         sr++;
         if(sr>er){
            break;
         }
         for(int i=sr;i<=er;i++){
            arr.add (matrix[i][ec]);
         }
         ec--;
         if(sc>ec)break;
         for(int i=ec;i>=sc;i--){
           arr.add (matrix[er][i]);

         }
         er--;
         for(int i=er;i>=sr;i--){
           arr.add (matrix[i][sc]);
         }
         sc++;
      }
      return arr;
    }
}
package Arrays;
class SetZeros {
	
	public static void main(String args[]) {
		int[][] matrix = {
			    {1, 1, 1},
			    {1, 0, 1},
			    {1, 1, 1}
			};
		printMatrix(matrix);
		setZeroes(matrix);
		System.out.println("\nfinal matrix \n");
		printMatrix(matrix);
		
	}
    //brute force approach
//    public static void setZeroes(int[][] matrix) {
//    	for(int r=0;r<matrix.length;r++){
//             for(int c=0;c<matrix[0].length;c++){
//                 if(matrix[r][c]==0){
//                     for(int i=0;i<matrix.length;i++)
//                         if(matrix[i][c]!=0) matrix[i][c]=-1;
//                     for(int j=0;j<matrix[0].length;j++)
//                         if(matrix[r][j]!=0) matrix[r][j]=-1;
//                 }
//             }
//         }
//
//         for(int r=0;r<matrix.length;r++){
//             for(int c=0;c<matrix[0].length;c++){
//                 if(matrix[r][c]==-1) matrix[r][c]=0;
//             }
//         }
//    }

//    //better approach
    public static void setZeroes(int[][] matrix) {

        int r[]=new int[matrix.length];
        int c[]=new int[matrix[0].length]; 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r[i] = 0;
                    c[j] = 0;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix[0].length;j++){
            if(r[i]==0 || c[j]==0){
	            j=0;
	        	while(j<matrix[0].length) {
	        		matrix[i][j++]=0;
	        	}
            }
         }   
        }
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
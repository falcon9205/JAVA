public class adjacentzero {
    private static void zerolist(int matrix[][])
    {
        int i = matrix.length;
        int j = matrix[0].length;
      loop:  for(int k = 0;k<i;k++)
            for(int l=0;l<j;l++)
              {
                if(matrix[k][l]==0)
                 {
                    int length=k;
                    int width = l;
                    while(length!=-1)
                     {
                        if(matrix[length][l]!=0)
                          matrix[length][l]=-20;
                        length--;
                     }
                     length=k;
                     width=l;
                     while(length<i)
                     {
                        if(matrix[length][l]!=0)
                          matrix[length][l]=-20;
                        length++;  
                          
                     }
                     length=k;
                     width=l;
                     while(width>=0)
                     {
                       if(matrix[k][width]!=0)
                        matrix[k][width]=-20;
                       width--; 
                    }
                    length=k;
                    width=l;
                    while(width<j)
                    {
                        if(matrix[k][width]!=0)
                           matrix[k][width]=-20;
                        width++;
                    }
                
                 }
              }
              for(int k=0;k<i;k++)
                for(int l=0;l<j;l++)
                  if(matrix[k][l]==-20)
                    matrix[k][l]=0;
    }
    public static void main(String[] args) {
        int matrix[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        zerolist(matrix);
        for(int i=0;i<matrix.length;i++)
        {
          for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");
          } System.out.println();
        }
    }
}


public class Array3D {
	public static void main(String arg[])
	{
		int collegemarks[][][]= {{{10,4,5,6,7},{5,6,7,8,9},{2,3,4,5,6}},			
                                  {{11,4,5,8,9},{4,6,7,8,2},{4,8,7,6,3}},
                                  {{2,3,4,1,4},{3,4,5,8,9},{3,4,7,8,9}},};

				                 
				                 
		
		
	                            
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<5;k++)
				{
					
					
					System.out.print(collegemarks[i][j][k]+" \t  ");
				}
				
				System.out.println();
			}
				
				
				}
	}

}

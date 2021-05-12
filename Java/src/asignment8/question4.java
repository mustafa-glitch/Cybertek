package asignment8;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hollowreact("*");
		
	}

	public static void hollowreact(String str) {
		
		int rows = 5, columns = 5, i = 1, j=1;
	
		
		while(i <= rows)
		{
			j = 1;
			while(j <= columns)
			{
				if(i == 1 || i == rows || j == 1 || j == columns)
				{
					System.out.print("*"); 
				}
				else
				{
					System.out.print(" "); 
				}
				j++;
			}
			i++;
			System.out.print("\n"); 
		}	
	}

}

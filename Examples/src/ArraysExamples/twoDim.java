package ArraysExamples;

public class twoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int x [] [] =new int[3][];
		int x [] [] =new int[][] {{11,22,33},{44,55,66},{77,88,99}};
		
		x[0][0]=11;x[1][1]=22;
		
		for(int i=0;i<=2;i++) {
			
			for(int j=0;j<=2;j++)
			{
				
				System.out.print(x[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		String Cities[][]=new String[][] {{"Nagpur","Thane","Ranchi"},{"Mumbai","Pune","Noida"},{"Indore","Kolkata","Delhi"}};
for(int i=0;i<=2;i++) {
			
			for(int j=0;j<=2;j++)
			{
				
				System.out.print(Cities[i][j]+"  ");
			}
			System.out.println(" \t ");
		}
		
	
	}
}

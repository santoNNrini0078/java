
public class Ex_6811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a;
		a = new int[5][];
		for(int i=0; i<5; i++)
		{
			a[i]= new int[i+1];
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

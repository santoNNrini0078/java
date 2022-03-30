
public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		int[][] a;
		a = new int[5][5];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				a[i][j]=k++;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}		
		System.out.println("=====================================");
		
		int[][] b;
		b = new int[5][5];
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[0].length; j++)
			{
				b[i][j]=i+1;
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================");
		
		
		int[][] c;
		c = new int[5][5];
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[0].length; j++)
			{
				c[i][j]=j+1;
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================");
		
		
		int[][] d;
		d = new int[5][5];
		for(int i=0; i<d.length; i++)
		{
			for(int j=0; j<d[0].length; j++)
			{
				d[i][j]=(i+1)+(j*5);
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================");
		
		
		int f=1;
		int[][] e;
		e= new int[5][];
		for(int i=0; i<5; i++)
		{
			e[i]=new int[i+1];
			for(int j=0; j<e[i].length; j++)
			{
				e[i][j]=f++;
				System.out.print(e[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================");
		
		
		int h = 1;
		int[][] n;
		n= new int[5][];
		for(int i=0; i<5; i++)
		{
			n[i]=new int[5-i];
			for(int j=0; j<n[i].length; j++)
			{
				n[i][j]=h++;
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================");
		
		
		int w= 1;
		int[][] q;
		q=new int[5][5];
		for(int i=0; i<5; i++)
		{
			
			for(int j=i; j<5; j++)
			{
				q[i][j]=w++;
				System.out.printf("q[%d][%d] = %d\t",i,j,q[i][j]);				
			}
			
			System.out.println();
		}
		
	}

}

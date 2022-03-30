
public class Ex_679 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1+(1+2)+(1+2+3)~(~+100) 구하기
		
		int sum=0;
		int[][] a;
		a= new int[100][];
		for(int i=0; i<100; i++)
		{
			int k=1;
			a[i]=new int[i+1];
			for(int j=0; j<a[i].length; j++)
			{				
				a[i][j]=k++;
				System.out.print(a[i][j]+"\t"); //제대로 설정했나 출력해봄
				sum = sum+k;
			}
			System.out.println();
		}
		System.out.println(sum);
		
	}

}

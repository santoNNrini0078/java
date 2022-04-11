
public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
class Mydata
{
	int[] a;
	
	int min()
	{
		int min = a[0];	
		for(int i=0; i<a.length; i++)
		{
			if (min>a[i])
			{
				min=a[i];
			}			
		}
		return min;
	}
		
	int max()
		{			
			int max = a[0];
			for(int i=0; i<a.length; i++)
			{				
				if (max <a[i])
				{
					max=a[i];
				}
			}		
			return max;
	}
	
}
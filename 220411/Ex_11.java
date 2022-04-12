
public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] {10, 40, 20, 33, 8};
		MyData ret = minMax(a);
		System.out.println(ret.max);
		System.out.println(ret.min);
		
	}

	static MyData minMax(int[] array)
	{
		//최대값과 최소값을 구해서
		MyData data = new MyData();
		data.min = array[0];
		data.max = array[0];
		for(int i=0; i<array.length; i++)
		{			
			if (data.min>array[i])
			{
				data.min=array[i];
			}
			
			if (data.max <array[i])
			{
				data.max=array[i];
			}
		}
		return data;
		
	}
}
class MyData
{
	int min;
	int max;
	
}


public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10, b=5;
		int[] c;
		System.out.println("ȣ�� ��--");
		System.out.println(a);
		System.out.println(b);
		
		c = addOne(a,b);
		
		System.out.println("ȣ�� ��--");
		System.out.println(c[0]);
		System.out.println(c[1]);
	}
	
	static int[] addOne(int x, int y)
	{
		int[] f = new int[2];
		f[0] = ++x;
		f[1] = ++y;
		
		System.out.println("addOne�Լ�");
		System.out.println(f[0]);
		System.out.println(f[1]);
		
		return f;
	}

}

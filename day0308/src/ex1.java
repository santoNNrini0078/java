
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d \n", 10); //%d 10�� ������ ���(decimal)
		System.out.printf("%o \n", 10); //%o 8�� ������ ���
		System.out.printf("%x \n", 10); //%x 16�� ������ ���
		//2���� ��� ���� ���ڴ� ����
		System.out.printf("%b \n", true); //%b ����(boolean)
		System.out.printf("%f \n", 3.14); //%f �Ǽ� ���(float), %.1f �Ҽ��� 1�ڸ����� ���
		System.out.printf("%c \n", 'a'); // %c ���� �ϳ� ���(character)
		System.out.printf("%s \n", "abc"); //%s ���� �ϳ� ���(string)
		System.out.printf("%s, %c��, %d��, %.1fcm \n", "ȫ�浿", 'b', 20, 180.5);
		
		
		int a = 10;// ���� ���ͷ�
		System.out.println(a);
		char ch = 'q';//���ڸ��ͷ�
		System.out.println(ch);
		double d = 2.56;//�Ǽ����ͷ�
		System.out.println(d);
		
		double e = 2.56d;
		System.out.println(e);
		byte num = 10;
		System.out.println(num);
		float f = 3.14f;
		System.out.println(f);
		
		char g = 'x';
		System.out.println(g);
		g= 'v';
		System.out.println(g);
		
		boolean b = true;
		System.out.println(b);
		
		boolean c = false;
		System.out.println(c);
		
		String str = "this is string";//���ڿ� ����. �⺻ Ÿ��ó�� ��� ����.
		System.out.println(str);
	}

}

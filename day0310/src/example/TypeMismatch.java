package example;

public class TypeMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b = 13;
		float c = 0;
		//�ڵ� ����ȯ
		//�º��� float, �캯�� int
		//�캯 ��� ���(int)�� float���� ��ȯ�Ǿ� �º� c�� ����
		c = (a+b)/(float)2;//25/2=12.5
		System.out.println("a�� b�� ����� "+c+"�̴�.");
		
		char c1='A';
		System.out.println(c1);
		char c2= ++c1;
		//c1+1 �� char + int Ÿ���� �޶�
		System.out.println(c2);
		int c3 = (c1+1);
		System.out.println((char)c3);
	}

}

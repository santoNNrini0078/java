package example;

public class Ex17_Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5, j;
		j = i++;
		System.out.println("j="+j);
		j=++i;
		System.out.println("j="+j);
		j=i--;
		System.out.println("j="+j);
		j=--i;
		System.out.println("j="+j);
		System.out.println("���� i = "+i);
		System.out.println("i++ : "+i++); //5����� +1 �Ǿ� i=6�� ���� ������ ����
		System.out.println("++i : "+(++i));// 6�� ���� ���� i�� 1�� ���� ��Ų �� ���, 7
		System.out.println("i-- : "+i--); // ������ i =7 �� ���¿��� ��� �� -1�� ��Ų ���� 6
		System.out.println("--i : "+(--i)); // 6�� ���� ���� i ���� -1 ���� �� ��� 5
	}

}

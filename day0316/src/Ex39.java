import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� �غ��� ������ �Է�");
		int l = sc.nextInt();
		System.out.println("�ﰢ���� ���̸� ������ �Է�");
		int h= sc.nextInt();
		
		float cm2 = ((float)l * (float)h) / 2;
		System.out.printf("�ﰢ���� ���̴� %.1f �Դϴ�.", cm2);
	}

}

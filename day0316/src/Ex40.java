import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������?");
		int a = sc.nextInt();
		System.out.println("���� ������?");
		int b = sc.nextInt();
		System.out.println("���� ������?");
		int c = sc.nextInt();
		System.out.println("���� ������?");
		int d = sc.nextInt();
		System.out.println("���� ������?");
		int e = sc.nextInt();
		
		int sum = a+b+c+d+e;
		float avg = (float)sum / 5;
		System.out.printf("�հ�� %d �Դϴ�.\n",sum);
		System.out.printf("����� %.1f �Դϴ�.",avg);
		
	}

}

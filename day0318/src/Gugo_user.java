import java.util.Scanner;

public class Gugo_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�� ���� ����ұ��?");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		for(int j = 1; j<10; j++)
		{
			System.out.printf("%d*%d=%d\n",i,j,i*j);
		}
		
	}

}

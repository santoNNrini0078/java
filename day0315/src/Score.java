import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*score�� 68�̴�.
		 * score�� 60 �̻��̸� �հ��� ����ϰ�
		 * �׷��� ������ ���հ��� ����Ͻÿ�
		 */
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("������ �Է��ϼ���");
			int score = sc.nextInt();
			
			if (score >= 90)
			{
				System.out.println("��");
			}
			else if (score >=80)
			{
				System.out.println("��");
			}
			else if (score >=70)
			{
				System.out.println("��");
			}
			else if (score >=60)
			{
				System.out.println("��");
			}
			else
			{
				System.out.println("���հ�");
			}
			
		}
	}

}

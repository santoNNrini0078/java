import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*score가 68이다.
		 * score가 60 이상이면 합격을 출력하고
		 * 그렇지 않으면 불합격을 출력하시오
		 */
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("점수를 입력하세요");
			int score = sc.nextInt();
			
			if (score >= 90)
			{
				System.out.println("수");
			}
			else if (score >=80)
			{
				System.out.println("우");
			}
			else if (score >=70)
			{
				System.out.println("미");
			}
			else if (score >=60)
			{
				System.out.println("양");
			}
			else
			{
				System.out.println("불합격");
			}
			
		}
	}

}

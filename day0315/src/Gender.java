

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int gender = 4; //3,4
		//gender가 3인경우 '남자로 출력
		//gender가 4인 경우 '여자'로 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요");
		int gender = sc.nextInt();
		
		if (gender ==2 || gender == 4)
		{
			System.out.println("여자");
		}
		else if (gender ==1 || gender ==3)
		{
			System.out.println("남자");
		}
		else
		{
			System.out.println("잘못입력");
		}
		
	}

}

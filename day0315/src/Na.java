import java.util.Scanner;

public class Na {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int python = 60, java = 70, android = 80, c = 50, cpp = 30;
		int sum = python + java + android + c + cpp;
		float avg= sum /5;
		System.out.print("나잘난의 성적 총합계는 "+sum +" 입니다. ");
		System.out.println("평균은 "+avg +" 입니다.");
		
		System.out.printf("나잘난의 성적 총합계는 %d 입니다. 평균은 %.1f 입니다.",sum,avg);
		
		
//		int sum = 0
//		sum = sum + a;
//		sum = sum + b; 이런식으로 변수 더하기
//		float avg = sum / 5.0f; // int/float -> float
		
		
		int w = 6, h = 5;
		float l = 4.0f;
		float v = w * l * h; // int*int*float => float
		System.out.println(v);
				
		
		int r = 3, hi= 7; // r반지름, hi 높이
		float pi = 3.14f; //pi 파이
		float vol = pi * hi * r*r; // 부피
		System.out.println(vol);
		
		
		int x =2;
		if (x % 2 == 0)
		{
			System.out.println("짝수입니다.");
		}
		else
		{
			System.out.println("홀수입니다.");
		}
		
		
		System.out.println("자연수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int jayeon = sc.nextInt();
		
		if (jayeon % 2 == 0)
		{
			System.out.println("입력한 값은 짝수입니다.");
		}
		else
		{
			System.out.println("입력한 값은 홀수입니다.");
		}
	}

}

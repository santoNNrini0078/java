
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d \n", 10); //%d 10진 정수를 출력(decimal)
		System.out.printf("%o \n", 10); //%o 8진 정수를 출력
		System.out.printf("%x \n", 10); //%x 16진 정수를 출력
		//2진수 출력 서식 문자는 없음
		System.out.printf("%b \n", true); //%b 논리값(boolean)
		System.out.printf("%f \n", 3.14); //%f 실수 출력(float), %.1f 소수점 1자리까지 출력
		System.out.printf("%c \n", 'a'); // %c 문자 하나 출력(character)
		System.out.printf("%s \n", "abc"); //%s 문자 하나 출력(string)
		System.out.printf("%s, %c형, %d세, %.1fcm \n", "홍길동", 'b', 20, 180.5);
		
		
		int a = 10;// 정수 리터럴
		System.out.println(a);
		char ch = 'q';//문자리터럴
		System.out.println(ch);
		double d = 2.56;//실수리터럴
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
		
		String str = "this is string";//문자열 저장. 기본 타입처럼 사용 가능.
		System.out.println(str);
	}

}

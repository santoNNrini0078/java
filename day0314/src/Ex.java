
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(7|4);
		System.out.println(7&4);
		System.out.println(7^5);
		System.out.println(7^4);
		
		
		int x = -10;
		int absX = x >= 0 ? x : -x;
		System.out.println(absX);
		
		int score = 50;
		char grade = score >= 90 ? 'A' : (score >= 80? 'B' : 'C');
		System.out.println(grade);
	}

}

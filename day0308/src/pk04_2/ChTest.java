package pk04_2;

public class ChTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char aVar = 'A';
		System.out.println("aVar : " + aVar);
		System.out.println("aVar : " + (int)aVar);
		
		int result = ((int)aVar+1); // B의 코드값 //66
		System.out.println((char)result);
		System.out.println("aVar : " + (int)result);
		
		aVar =97;
		System.out.println("aVar : " + aVar);
				
		char aa = 97;
		System.out.println("aa : " + aa);
				
		char bVar = 'B';
		System.out.println("bVar : " + bVar);
		System.out.println("bVar : " + (int)bVar);
		}

}

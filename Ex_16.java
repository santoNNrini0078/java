import java.util.Scanner;
public class Ex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//toCahrArray()참조하여 글자를 섞어서 보여주고 원래 단어를 맞추기
		
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"television", "computer", "mouse", "phone"};
		
		for(int i=0; i<str.length; i++)
		{
			String str2 = shuffle(str[i]);
			System.out.println("Q1. "+ str2 +"의 정답을 입력하세요.");
			String b= sc.next();
			
			if(b.equals(str[i]))
				{
					System.out.println("맞았습니다.");
				}
				else
				{
					System.out.println("틀렸습니다.");
				}	
		}				
	}
	
	static String shuffle(String a)
	{		
		String s = "null";
		char[] b = a.toCharArray();
		
		int temp = 0;		
		b[0] = b[0];
				
		temp = b[0];
		b[0] = b[1];
		b[1] = temp;
	
		
		String str3 = new String(b);		
		return str3;		
	}

}

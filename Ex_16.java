import java.util.Scanner;
public class Ex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//toCahrArray()�����Ͽ� ���ڸ� ��� �����ְ� ���� �ܾ ���߱�
		
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"television", "computer", "mouse", "phone"};
		
		for(int i=0; i<str.length; i++)
		{
			String str2 = shuffle(str[i]);
			System.out.println("Q1. "+ str2 +"�� ������ �Է��ϼ���.");
			String b= sc.next();
			
			if(b.equals(str[i]))
				{
					System.out.println("�¾ҽ��ϴ�.");
				}
				else
				{
					System.out.println("Ʋ�Ƚ��ϴ�.");
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

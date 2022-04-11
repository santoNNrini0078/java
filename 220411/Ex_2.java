
public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스 타입의 크기가 3인 배열을 생성. 무슨말일까?

		Student s1= new Student();
	}

}

class Student
{
	String name;
	int no;
	int kor;
	int eng;
	int math;
	int sum;
	
	void sum()
	{
		sum = kor + eng + math;
	}
	
	
	void print()
	{
		System.out.println("총점 : "+sum);
	}
}
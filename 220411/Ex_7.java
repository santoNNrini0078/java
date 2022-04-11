
public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewStudent st1 = new NewStudent();
		st1.name = "chulsu";
		st1.ban =2;
		st1.music = 100;
		st1.math = 50;
		
		st1.getTotal();
		st1.getAverage();
		System.out.println(st1.getTotal());
		System.out.println(st1.getAverage());
	}

}
class NewStudent
{
	String name;
	int ban;
	int no;
	int music;
	int math;
//	int getTotal;
	
	
	int getTotal()
	{	
		return music+math;
	}
	
	float getAverage()
	{
		float avg = getTotal()/2.0f;
		return avg;
	}
}

//9. 객체를 3개 만들어라, (객체배열생성) 객체에 값도 할당하라.....무슨말이지?
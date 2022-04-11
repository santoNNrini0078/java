
public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcurator a = new Calcurator();
		a.x = 20;
		a.y = 5;
		a.add();
		a.sub();
		a.mul();
		a.divid();
		
		
//		Calcurator[] cal = new Calcurator[3]; // 정상 작동할 수 있도록
//		 
//		cal[0].x=5;
//		cal[0].y=9;
	}

}

class Calcurator
{
	int x;
	int y;
	
	int add()
	{
		return x+y;
	}
	
	int sub()
	{
		return x-y;
	}
	
	int mul()
	{
		return x*y;
	}
	
	int divid()
	{
		return x/y;
	}
}
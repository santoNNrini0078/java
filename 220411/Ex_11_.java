
public class Ex_11_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCard c1 = new CreditCard();
		c1.number = 3847939;
		c1.owner ="유재석";
		System.out.println(c1.number + c1.owner);
	}

}

class CreditCard
{
	long number;
	String owner;
	int balance;
	float point;
	
	void use(int a)
	{
		balance = balance + a;
	}
	
	void payBill(int amount)
	{
		balance = balance - amount;
		addPoint(amount);
	}
	
	void addPoint(int amount)
	{
		point = point + amount/1000;
	}
}
// 개개체배열을 메인에서ㅏ 선언, 생성, 5개 배열
// 각 배열에 번호와 소유자를 임의로 할당
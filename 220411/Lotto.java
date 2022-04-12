
public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//로또번호 생성기 만들기
//가장 많이 불린 숫자 찾기
//로또 10개 만들기	-> 담긴 번호 count	
		
		int[] numbersCnt = new int[45];
		for(int i=0; i<10; i++)
		{
			Lotto myLotto = new Lotto();
			myLotto.lotto = myLotto.generateNumber();
			for(int j=0; j<myLotto.lotto.length; j++)
			{
				numbersCnt[myLotto.lotto[j]-1]++; //myLotto.lotto[j];//45, 12, 3, 6, 7, 10
			}
		}
		int max = numbersCnt[0];
		int idx =0;
		for (int i=0; i<45; i++)
		{
			if(numbersCnt[i]>max)
			{
				max = numbersCnt[i];
				idx = i;
			}
		}
		System.out.println((idx+1)+"의 숫자가" +max+"번 불렸습니다.");

}
static class Lotto
{
	int[] lotto = new int[6];
	
	int[] generateNumber()
	{
		//0.0*45<=Math.random()*45<1.0*45
		//0+1 <=(int)Math.random()*45+1 < 45.0 +1
		//1-45
		
		int i =0;
		while (i<6)
		{
			int rndNum = (int)(Math.random()*45+1);//1-45사이의 값을 얻음
			boolean isDup = false;
			for(int j=0; j<lotto.length; j++)
			{
				if (lotto[j]== rndNum)
				{
					isDup=true;
					break;
				}
			}
			//if (!isDup)
			if (isDup==false)
			{//중복되지 않은 경우 로또배열에 채우자
				lotto[i] = rndNum;
				i++;
			}			
		}
		return lotto;		
	}
}
}

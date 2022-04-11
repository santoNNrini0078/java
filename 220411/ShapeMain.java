//import java.awt.Point;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect = new Rectangle();
		Point p = new Point();
		p.x =5; p.y =7;
		rect.setPoint(p);
		int a = rect.area(rect.getPoint());
		System.out.println("면적은"+a);
		
		Point p2 = new Point();
		p2.x = 10;
		p2.y = 19;
		int b = rect.line(rect.getPoint(),p2);
		System.out.println("둘레는" +b);
	}

}
class Rectangle
{
	Point p;
	
	void setPoint(Point _p)
	{
		p= _p;
	}
	Point getPoint()
	{
		return p;
	}
	int area(Point p)
	{
		return p.x *p.y;
	}
	int line(Point p1, Point p2)
	{
		return Math.abs(p1.x-p2.x)*2 + Math.abs(p1.y-p2.y)*2;
	}
}
class Point
{
	int x;
	int y;
	void print()
	{
		System.out.println("점은 x= "+"y= "+y);
	}
}
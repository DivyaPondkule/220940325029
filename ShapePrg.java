/*Q3 : Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square, each class has two member function
named draw () and erase (). Create these using Runtime Polymorphism concepts. 
(10 Marks*/
class shape
{
	void draw()
	{
		System.out.println("Shape drawn");
	}
	
	void erase()
	{
		System.out.println("Shape erased");
	}
}

class circle extends shape
{
	void draw()
	{
		System.out.println("Circle drawn");
	}
	
	void erase()
	{
		System.out.println("Circle erased");
	}
}

class triangle extends shape
{
	void draw()
	{
		System.out.println("Triangle drawn");
	}
	
	void erase()
	{
		System.out.println("Triangle erased");
	}
}

class square extends shape
{
	void draw()
	{
		System.out.println("Square drawn");
	}
	
	void erase()
	{
		System.out.println("Square erased");
	}
}

public class ShapePrg {
	public static void main(String[] args) {
		shape s = new shape();
		s.draw();
		s.erase();
		circle c = new circle();
		c.draw();
		c.erase();
		triangle t = new triangle();
		t.draw();
		t.erase();
		square sq = new square();
		sq.draw();
		sq.erase();
	}
}

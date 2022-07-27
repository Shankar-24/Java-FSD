package MethodOverload;

public class Methodoverload {

	public int calculate(int a,double b)
	{
		return (int) (a+b);
	}
	public int calculate(int r)
	{
		return ((22/7)*r*r);
	}
	public int calculate(int l,int b)
	{
		return l*b;
	}
	
	public static void main(String[] args) {
		
		Methodoverload MO=new Methodoverload();	
		System.out.println("Sum of two numbers= " + MO.calculate(4,7.9));
		System.out.println("Area of circle= " + MO.calculate(5));
		System.out.println("Area of rectangle= " + MO.calculate(4,8));

	}

}

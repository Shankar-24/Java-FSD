package datatype;

public class Typecasting {
	
     public static void main(String[] args) {
		float flt=5.5F;
		long lng=(long) flt;
		System.out.println("Float --> long: " + lng);
		double dbl=80.5;
		char cr=(char) (int) (long) dbl;
		System.out.println("Double --> Long --> Int --> Char: " + cr);
		long lng1=76525677;
		byte bt=(byte) lng1;
		System.out.println("Long --> Byte: " + bt);
		int a=89;
		long lng2=(long) (double) a;
		System.out.println("Int --> Double --> Long: " + lng2);
	}
}
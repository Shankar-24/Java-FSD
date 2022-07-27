package StringBuffer;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Started java");
		System.out.println(s);
        s.append("Phase1");
        System.out.println(s);
        s.delete(2, 5);
        System.out.println(s);
        s.replace(9,13,"Python");
        System.out.println(s);
        s.insert(9,"Language");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        System.out.println(s.charAt(9));

	}

}

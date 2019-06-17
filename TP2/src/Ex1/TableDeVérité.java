package Ex1;

public class TableDeVérité {

	public static void main(String[] args) {
		
        boolean a; 
        boolean b;
        boolean c;
		
		System.out.println("a\tb\ta->b");		
		a = false; 
		b = false; 
		c = !a||b;
		
		System.out.println(a + "\t" + b + "\t" + c);
		a = false; 
		b = true; 
		c = !a||b;
		
		System.out.println(a + "\t" + b + "\t" + c);
		a = true; 
		b = false; 
		c = !a||b;
		
		System.out.println(a + "\t" + b + "\t" + c);
		a = true; 
		b = true; 
		c = !a||b;
		
		System.out.println(a + "\t" + b + "\t" + c);
		a = true; 
		b = true; 
		c = !a||b;
	}

}

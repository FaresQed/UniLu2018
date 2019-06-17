package Ex9;

public class PrefixesPostfixe {

	public static void main(String[] args) {
		int i = 0, j, k;
		
		i++;
		System.out.println("i = " + i);
		++i;
		System.out.println("i = " + i);
		System.out.println("i = " + ++i);
		System.out.println("i = " + i++);
		System.out.println("i = " + i);
		
		j=i++;System.out.println("i="+i+",j="+j);
		j=++i;System.out.println("i="+i+",j="+j);
	
		k=i+++++j;
		System.out.println("i="+i+++", j = "+++j+",k="+k++);
		k=++i+j++;
		System.out.println("i="+i+",j="+j+",k="+k);


	}

}

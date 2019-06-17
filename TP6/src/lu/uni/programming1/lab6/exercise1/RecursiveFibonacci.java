package lu.uni.programming1.lab6.exercise1;

public class RecursiveFibonacci {

	private static long fibo(int n) {
		return n < 3 ? 1 : fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		for(int i = 1; i < 11; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
}
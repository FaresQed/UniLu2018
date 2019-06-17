package lu.uni.programming1.lab6.exercise2;

public class RecursiveFibonacciMemoizationExperiment {
	
	private static final int N = 90;
	private static final boolean CLEAR_CACHE = true;
	
	private static long[] cache = new long[N];
	private static boolean useMemoization;

	private static long innerFibo(int n) {
		return n < 3 ? 1 : fibo(n-1) + fibo(n-2);
	}
	
	private static long fibo(int n) {
		if(useMemoization) {
			if(cache[n] == 0)
				cache[n] = innerFibo(n);
			return cache[n];
		} else {
			return innerFibo(n);
		}
	}
	
	public static void main(String[] args) {
		for(int n = 3; n < N; n++) {
			for(int trial = 1; trial <= 2; trial++) {
				useMemoization = trial == 2;
				
				if(useMemoization && CLEAR_CACHE) {
					cache = new long[n+1];
				}
				
				long t1 = System.nanoTime();
				long result = fibo(n);
				long t2 = System.nanoTime();
				System.out.println(String.format("fibo(%3d) = %4d (t = %5.5f ms, memoization: %s)", n, result, (t2-t1)/Math.pow(10, 6), useMemoization ? "ON " : "OFF"));
			}
			System.out.println();
		}
	}
}
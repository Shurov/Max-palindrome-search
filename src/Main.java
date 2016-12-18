
public class Main {
	public static final int numRank = 5;
	public static final long topLimit = (long) java.lang.Math.pow(10, numRank) - 1;
	public static final long lowLimit = (long) java.lang.Math.pow(10, numRank - 1);
		
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Palindrome maxPalind = new Palindrome(); 
		findMaxPalindrome(maxPalind);
		double timeSpent = (double) (System.nanoTime() - startTime) / 1000000;
		System.out.println(timeSpent + " ms. Max palindrome is " + maxPalind.getIMax() + " * " + maxPalind.getJMax() + " = " + maxPalind.getMaxMultipl());
	}
	
	private static void findMaxPalindrome(Palindrome palind){ 
//		BruteForceSolution.findMaxPalindromeBruteForce(palind);  
		ComposeAndCheckSolution.findMaxPalindromeCompose(palind);	
	}
}
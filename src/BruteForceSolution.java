
public class BruteForceSolution {
	/* The simplest brute force solution.
	 * Nested loops try to pick 2 multipliers that will give maximum valid result
	 */
	
	public static void findMaxPalindromeBruteForce(Palindrome palind){
		for (long i = Main.topLimit; i > Main.lowLimit; i--){
			for (long j = i; j > Main.lowLimit; j--){
				long mult = i * j;
				if (mult > palind.getMaxMultipl() && isPalindrome(mult + "")){
					palind.setMaxMultipl(mult);
					palind.setIMax(i);
					palind.setJMax(j);
				}
			}
		}
	}
	
	private static boolean isPalindrome(String strToCheck){
		return strToCheck.equals(new StringBuffer(strToCheck).reverse().toString());
	}
}
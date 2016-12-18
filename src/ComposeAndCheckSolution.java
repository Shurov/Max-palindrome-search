
public class ComposeAndCheckSolution {
	/* Solution composes valid result - a palindrome:
	 * loop through numbers in descending order and concatenate mirrored number to get a palindrome.
	 * Then the palindrome is checked if it can be derived by multiplying 2 n-digit numbers.
	 */
	
	public static void findMaxPalindromeCompose(Palindrome palind){
		for (long i = Main.topLimit; i > Main.lowLimit; i--){
			long palindrome = Long.parseLong(composePalindrome(i));
			if (palindrome > palind.getMaxMultipl() && isDivisible(palindrome, palind)){
				palind.setMaxMultipl(palindrome);
				palind.setIMax(i+1);
			}
		}
	}

	private static String composePalindrome(long firstHalf){
		return firstHalf + new StringBuffer(firstHalf + "").reverse().toString();
	}
	
	private static boolean isDivisible(long numerator, Palindrome palind){
		for (long denominator = Main.topLimit; denominator >= Main.lowLimit; denominator--){
			if ((numerator % denominator == 0) && (numerator / denominator <= Main.topLimit)){
				palind.setJMax(denominator);
				return true;
			}
		}
		return false;
	}
}
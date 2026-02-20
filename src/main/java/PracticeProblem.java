
public class PracticeProblem {
	
	public static void main(String args[]) {

	}

	//Question 1
	public static int letterToFive(String word, char letter) {
		int index = 0;
		int count = 0;

		while (index < word.length()) {
			if (word.charAt(index) == letter) {
				count++;
				if (count == 5) {
					return index + 1;
				}
			}
			index++;
		}
		return -1;
	}

	//Question 2
	public static String countLetter(String letter, String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter.charAt(0)) {
				count++;
			}
		}
		return count + "";
	}

	//Question 3
	public static int oddSum(int num, int num2) {
		if (num > num2) {
			int oddNumber = num;
			num = num2;
			num2 = oddNumber;
		}
		int sum = 0;

		while (num <= num2) {
			if (num % 2 == 1) {
				sum += num;
			}
			num++;
		} 
		return sum;
	}	
}

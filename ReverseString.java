package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TestLeaf";
		char[] reverse = str.toCharArray();
		for (int i = reverse.length - 1; i >= 0; i--) {
			System.out.print(reverse[i]);
		}
	}

}

package basicjava;

public class Question1 {
	public static void main(String[] args) {

		String s = "dAAftAAffAB";
		char c = 'A';
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				n = n + 1;
		}
		System.out.println(n);

	}

}

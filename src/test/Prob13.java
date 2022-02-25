package test;

public class Prob13 {
	private static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = " ";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < sourceString.length(); i++) {
			if (sourceString.charAt(i) != ' ') {
				int s = sourceString.charAt(i) + 3;
				if (s > 'z') {
					s = s - ('z'-'a'+1);
				}
				sb.append((char)s);
			}else {
				sb.append(sourceString.charAt(i));
			}
		}
		encodedString = sb.toString();
	}

}

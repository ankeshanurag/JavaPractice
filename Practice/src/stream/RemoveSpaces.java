package stream;

import java.util.stream.Collectors;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my name is ankesh anurag";
		String res = str.chars().filter(c-> !Character.isWhitespace(c))
				.mapToObj(c-> String.valueOf((char)c)).collect(Collectors.joining());
		System.out.println(res);

	}

}

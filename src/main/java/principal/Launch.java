package principal;

import java.util.Arrays;

public class Launch {

	public static void main(String[] args) {
		Arrays.stream(args).forEach(System.out::println);
	}

}

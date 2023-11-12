import java.util.*;

class Main {
	public static void main(String[] args) {
		String out = "";
		for (int i=0; i<101; i++) {
			out = "";
			if (i%3 == 0) {
				out += "Fizz";
			}
			if (i%5 == 0) {
				out += "Buzz";
			}
			if (i%7 == 0) {
				out += "Bazz";
			}

			if (out != "") {
				System.out.println(out);
			}
			else {
				System.out.println(i);
			}
		}
	}
}

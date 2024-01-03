import java.util.ArrayList;

class Divisors {

	public static String FindDivisors (int num) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				res.add(i);
			}
		}
		
		return res.size() > 0 ? "" + res : "" + num + " is prime";
	}

}
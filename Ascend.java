// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int first, second, third;
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);
		first = Math.min(Math.min(a, b), c);
		third = Math.max(Math.max(a, b), c);
		second = a + b + c - first - third;
		System.out.println(a + ", " + b + ", " + c);
		System.out.println(first + ", " + second + ", " + third);
	}
}

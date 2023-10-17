public class Functions {
	public static void main(String[] args) {
		String name = "Gigi";
		Hello(name);
		System.out.println("A + B = " + sum(3, 4));
	}

	public static void Hello(String name){
		System.out.println("Hello, " + name);
	}

	public static int sum (int a, int b){
		return (a + b);
	}
}
public class C9EX02 {
	public static void main(String[] args) {
		double serie = 0;
		for (int lux = 1; lux <= 100; lux++) {
			serie += (float) (lux) / (Math.pow(lux, 2) + lux - 1);
		}
		System.out.println("O valor da série é de " + serie);
	}
}

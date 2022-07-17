public class C9EX10F {
	public static void main(String[] args) {
		double num, den, serie = 0;
		for (int aux = 1; aux <= 100; aux++) {
			num = Math.pow(aux, 2);
			den = Math.pow(2 * aux, 2);
			serie += (float) num / den;
		}
		System.out.println("O valor final é de " + serie);
	}
}

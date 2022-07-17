public class C9EX10E {
	public static void main(String[] args) {
		double num, den, serie = 0;
		for (int aux = 1; aux <= 100; aux++) {
			num = aux;
			den = aux * 2 * 3;
			serie += (float) num / den;
		}
		System.out.println("O resultado da série é de " + serie);
	}
}

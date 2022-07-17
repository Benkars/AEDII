public class C9EX10D {
	public static void main(String[] args) {
		double num, den, serie = 0;
		for (int aux = 1; aux <= 100; aux++) {
			num = aux + aux - 1;
			den = Math.pow(aux, 2);
			serie += (float) num / den;
		}
		System.out.println("O valor da série é de " + serie);

	}
}

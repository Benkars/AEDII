public class C9EX11D {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado;
		for (int aux = 1; aux <= 100; aux++) {
			num = Math.pow(aux, 3);
			den = Math.pow(10, aux - 1);
			serie += (float) num / den;
		}
		System.out.println("O resultado é " + serie);
	}
}

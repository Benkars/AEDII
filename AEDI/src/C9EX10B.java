public class C9EX10B {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado;
		for (int aux = 1; aux <= 100; aux++) {
			num = aux * 2;
			den = aux * 3;
			serie += (float) num / den;
		}
		resultado = 1 + Math.sqrt(serie);
		System.out.println("O valor da série é de " + resultado);
	}
}

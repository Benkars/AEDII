public class C9EX12 {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado;
		for (int aux = 1; aux <= 10000; aux++) {
			num = Math.pow(-1, aux);
			den = aux * 2 + 1;
			serie += (float) num / den;
		}
		resultado = 4 * (1 + serie);
		System.out.println("O valor de Pi pela expressão é de " + resultado);
	}
}

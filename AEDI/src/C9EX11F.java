public class C9EX11F {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado;
		for (int aux = 1; aux <= 100; aux++) {
			num = (aux * 2 - 1) * Math.pow(2, aux + 1);
			den = Math.pow(aux * 5 - 3, 2);
			serie += (float) num / den;
		}
		resultado = 5.0 * Math.sqrt(serie);
		System.out.println("O valor da expressão é " + resultado);
	}
}

public class C9EX10C {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado;
		for (int aux = 1; aux <= 100; aux++) {
			num = aux * 2 - 1;
			den = aux * 2;
			serie += (float) num / den;
		}
		resultado = Math.pow(serie, 2)/3;
		System.out.println("O valor da série é de " + resultado);
	}
}

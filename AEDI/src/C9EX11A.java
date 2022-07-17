public class C9EX11A {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado;
		for (int aux = 1; aux <= 100; aux++) {
			num = aux + aux * 7 - 6;
			den = Math.pow(4, aux-1);
			serie += (float) num / den;
		}
		resultado = Math.cbrt(serie);
		System.out.println("O valor da série é de " + resultado);
	}

}

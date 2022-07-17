public class C9EX11B {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado;
		for (int aux = 1; aux <= 100; aux++) {
			num = aux * 3 - 2;
			den = Math.sqrt(aux * 3 + 4);
			serie += (float) num / den;
		}
		resultado = (5 / 3.0) * serie;
		System.out.println("O valor da série é de " + resultado);
	}
}

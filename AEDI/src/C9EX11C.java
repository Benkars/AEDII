public class C9EX11C {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado;
		for (int aux = 1; aux <= 100; aux++) {
			num = ((aux * 2) + 1) * Math.sqrt(aux * 4 + 1);
			den = Math.pow(5, aux);
			serie += (float) num / den;
		}
		resultado = Math.pow(serie, 2);
		System.out.println("O valor é de " + resultado);
	}
}

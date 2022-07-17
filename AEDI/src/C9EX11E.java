public class C9EX11E {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado;
		for (int aux = 1; aux <= 100; aux++) {
			num = Math.pow(aux, 2) * Math.sqrt((aux * 2) + 3);
			den = Math.pow(aux +1, aux);
			serie += (float) num / den;	
		}
		resultado = (2 / 3.0) * serie;
		System.out.println("O valor é de " + resultado);
	}
}

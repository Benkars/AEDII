public class C9EX06 {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado;
		for (int aux = 1; aux <= 20; aux++) {
			num = aux;
			den = Math.sqrt(aux * 2);
			serie += ((float) num / den);
		}
		resultado = serie + 10;
		System.out.println("O resultado da série é de " + resultado);
	}
}

public class C6EX17 {
	public static void main(String[] args) {
		double num, den, serie = 0, resultado=0;
		for (int aux = 1; aux <= 100; aux++) {
			num = Math.pow(7,aux-1);
			den = aux*Math.pow((aux*9)+1, aux*2);
			serie += num / den;
		}
		resultado = 71+Math.cbrt(serie);
		System.out.print("O valor da série é de %1.8f" +resultado);

	}
}

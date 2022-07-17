public class C11EX14 {
	public static void main(String[] args) {
		double serie = 0, total = 0, num, den;
		int cont = 0;
		do {
			cont++;
			num = Math.pow(-1, cont);
			den = 2 * cont + 1;
			serie += num / den;
			total = 4 * (1 + serie);
			if (total > 3.1416 && total < 3.1417) {
				break;
			}
		} while (cont != -1);
		System.out.println("A quantidade de termos necessários é de " + (cont + 1));
		System.out.println("O resultado da série matemática é de " + total);
	}
}

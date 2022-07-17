public class C9EX07 {
	public static void main(String[] args) {
		double num, den, serie = 0;
		for (int aux = 1; aux <= 6; aux++) {
			num = aux * 2 - 2 + aux * 3;
			den = 7 * aux - aux + 1;
			serie += num / den;
		}
		System.out.println("O valor da série é de " + serie);
	}
}

public class C9EX10A {
	public static void main(String[] args) {
		double num, den, serie = 0;
		for (int aux = 1; aux <= 100; aux++) {
			num = aux;
			den = Math.sqrt(aux * 2);
			serie += (float) num / den;
		}
		System.out.println("O soma dos termos equivale a " + serie);
	}
}

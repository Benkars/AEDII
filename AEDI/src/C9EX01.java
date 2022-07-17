public class C9EX01 {
	public static void main(String[] args) {
		int cont = 0;
		double serie = 0;
		for (int aux = 37; aux >= 1; aux--) {
			cont++;
			serie += (float) aux * (aux + 1) / cont;
		}
		System.out.println("O valor da série corresponde a " + serie);
	}
}

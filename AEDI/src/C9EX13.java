public class C9EX13 {
	public static void main(String[] args) {
		double serie = 0, num;
		for (int lux = 1; lux <= 10; lux++) {
			num = 1;
			for (int aux = lux; aux > 1; aux--) {
				num *= aux;
			}
			if (lux % 2 != 0) {
				serie += (float) (num / (Math.pow(2, lux) - 1));
			} else {
				serie -= (float) (num / (Math.pow(2, lux) - 1));
			}
		}
		System.out.println("O resultado da equação é " + serie);
	}
}
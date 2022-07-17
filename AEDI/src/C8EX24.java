public class C8EX24 {
	public static void main(String[] args) {
		for (int aux1 = 1; aux1 <= 10; aux1++) {
			for (int aux2 = 1; aux2 <= 10; aux2++) {
				for (int aux3 = 1; aux3 <= aux2; aux3++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int lux2 = 10; lux2 >= 1; lux2--) {
				for (int lux = 1; lux <= lux2; lux++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}

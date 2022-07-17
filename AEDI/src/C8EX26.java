public class C8EX26 {
	public static void main(String[] args) {
		for (int aux = 1; aux <= 10; aux++) {
			for (int aux2 = 1; aux2 <= 128; aux2 += aux2) {
				for (int aux3 = 1; aux3 <= aux2; aux3++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int lux2 = 64; lux2 >= 1; lux2 = lux2 / 2) {
				for (int lux = 1; lux <= lux2; lux++)
					System.out.print("*");
				System.out.println();
			}
		}

	}
}
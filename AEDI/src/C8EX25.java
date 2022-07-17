public class C8EX25 {
	public static void main(String[] args) {
		for (int aux = 1; aux <= 10; aux++) {
			for (int aux2 = 1; aux2 <= 10; aux2++) {
				for (int aux3 = 1; aux3 <= aux2; aux3++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			for (int lux = 1; lux <=10; lux++) {
				for (int lux2 = 10; lux2 >= lux; lux2--) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}
}
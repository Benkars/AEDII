import java.util.Scanner;

public class C13EX05 {
	public static void main(String[] args) {
		double angulo, radiano;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do �ngulo: ");
		angulo = teclado.nextDouble();
		radiano = Math.toRadians(angulo);
		teclado.close();
		System.out.println("O valor do seno � " + Math.sin(radiano));
		System.out.println("O valor do cosseno � " + Math.cos(radiano));
		System.out.println("O valor da tangente � " + Math.tan(radiano));
		System.out.println("O valor do arco seno �: " + (float) 1 / Math.sin(radiano));
		System.out.println("O valor do arco tangente � " + (float) 1 / Math.tan(radiano));
		System.out.println("O valor do arco cosseno � " + (float) 1 / Math.cos(radiano));
	}
}
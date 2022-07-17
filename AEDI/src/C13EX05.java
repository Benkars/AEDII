import java.util.Scanner;

public class C13EX05 {
	public static void main(String[] args) {
		double angulo, radiano;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do ângulo: ");
		angulo = teclado.nextDouble();
		radiano = Math.toRadians(angulo);
		teclado.close();
		System.out.println("O valor do seno é " + Math.sin(radiano));
		System.out.println("O valor do cosseno é " + Math.cos(radiano));
		System.out.println("O valor da tangente é " + Math.tan(radiano));
		System.out.println("O valor do arco seno é: " + (float) 1 / Math.sin(radiano));
		System.out.println("O valor do arco tangente é " + (float) 1 / Math.tan(radiano));
		System.out.println("O valor do arco cosseno é " + (float) 1 / Math.cos(radiano));
	}
}
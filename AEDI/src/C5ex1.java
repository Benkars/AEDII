import java.util.Scanner;

public class C5ex1 {
	public static void main(String[] args) {
		double valorX;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor da variável X = ");
		valorX = teclado.nextDouble();
		valorX = Math.cbrt(((5 + valorX) / 2 + 10) * 100) + 7 * Math.pow(valorX, 5);
		System.out.println("F(x)= " + valorX);
		teclado.close();

	}

}

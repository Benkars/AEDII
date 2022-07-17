import java.util.Scanner;

public class C5ex5 {
	public static void main(String[] args) {
		Double celsius, fahrenheit, kelvin;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor da temperatura em graus Celsius: ");
		celsius = teclado.nextDouble();
		kelvin = celsius + 273;
		fahrenheit = 1.8 * celsius + 32;
		System.out.print(
				"As temperaturas em Kelvin e graus Fahrenheit são respectivamnete: " + kelvin + " e " + fahrenheit);
		teclado.close();

	}

}

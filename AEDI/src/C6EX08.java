import java.util.Scanner;

public class C6EX08 {
	public static void main(String[] args) {
		String nome;
		double altura, peso1, peso2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe a sua altura em metros: ");
		altura = teclado.nextDouble();
		peso1 = 20 * Math.pow(altura, 2);
		peso2 = 25 * Math.pow(altura, 2);
		System.out.printf("Para %s com altura = %1.2f \nO peso m�nimo � de %1.2f e o peso m�ximo � de %1.2f", nome,
				altura, peso1, peso2);
		teclado.close();
	}

}

import java.util.Scanner;

public class C7EX02 {
	public static void main(String[] args) {
		int nota1, nota2, nota3, media;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a nota da primeira prova: ");
		nota1 = teclado.nextInt();
		System.out.println("Informe a nota da segunda prova: ");
		nota2 = teclado.nextInt();
		System.out.println("Informe a nota da terceira prova: ");
		nota3 = teclado.nextInt();
		media = (nota1 + nota2 + nota3) / 3;
		switch (media) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Conceito E");
			break;
		case 5:
		case 6:
			System.out.println("Conceito D");
			break;
		case 7:
			System.out.println("Conceito C");
			break;
		case 8:
			System.out.println("Conceito B");
			break;
		case 9:
		case 10:
			System.out.println("Conceito A");
			break;
		}

		teclado.close();

	}

}

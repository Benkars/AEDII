import java.util.Scanner;

public class C11EX06 {
	public static void main(String[] args) {
		int numero, pessoas, cont = 0, cont2 = 0, cont3 = 0, cont4 = 0, soma = 0;
		double percent4, percent7, percent12, media;
		String maiorNumero;
		Scanner teclado = new Scanner(System.in);
		while (cont < 100) {
			System.out.print("Informe o n�mero do canal: ");
			numero = teclado.nextInt();
			System.out.print("Informe o n�mero de pessoas que estavam assitindo ao canal: ");
			pessoas = teclado.nextInt();
			cont++;
			soma += pessoas;
			switch (numero) {
			case 4:
				cont2++;
				break;
			case 7:
				cont3++;
				break;
			case 12:
				cont4++;
				break;
			}
		}
		if (cont3 > cont2 && cont3 > cont4) {
			maiorNumero = "o canal 7";
		} else if (cont2 > cont4) {
			maiorNumero = "o canal 4";
		} else {
			maiorNumero = "o canal 12";
		}
		percent4 = (float) cont2 * 100 / cont;
		percent7 = (float) cont3 * 100 / cont;
		percent12 = (float) cont4 * 100 / cont;
		media = (float) soma / cont;
		System.out.println("A audi�ncia no canal 4 � de " + cont2 + "\nA audi�ncia no canal 7 � de " + cont3
				+ "\nA audi�ncia no canla 12 � de " + cont4);
		System.out.println("A audi�ncia no canal 4 � de " + percent4 + "%\nA audi�ncia no canal 7 � de " + percent7
				+ "%\nA audi�ncia no canal 12 � de " + percent12 + "%");
		System.out.println("O n�mero do canal pesquisado mais assistido � " + maiorNumero);
		System.out.println("A m�dia de pessoas que estavam assistindo TV � de " + media);
		teclado.close();
	}
}

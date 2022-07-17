import java.util.Scanner;

public class C11EX06 {
	public static void main(String[] args) {
		int numero, pessoas, cont = 0, cont2 = 0, cont3 = 0, cont4 = 0, soma = 0;
		double percent4, percent7, percent12, media;
		String maiorNumero;
		Scanner teclado = new Scanner(System.in);
		while (cont < 100) {
			System.out.print("Informe o número do canal: ");
			numero = teclado.nextInt();
			System.out.print("Informe o número de pessoas que estavam assitindo ao canal: ");
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
		System.out.println("A audiência no canal 4 é de " + cont2 + "\nA audiência no canal 7 é de " + cont3
				+ "\nA audiência no canla 12 é de " + cont4);
		System.out.println("A audiência no canal 4 é de " + percent4 + "%\nA audiência no canal 7 é de " + percent7
				+ "%\nA audiência no canal 12 é de " + percent12 + "%");
		System.out.println("O número do canal pesquisado mais assistido é " + maiorNumero);
		System.out.println("A média de pessoas que estavam assistindo TV é de " + media);
		teclado.close();
	}
}

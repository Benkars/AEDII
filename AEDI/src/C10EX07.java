import java.util.Scanner;

public class C10EX07 {
	public static void main(String[] args) {
		double infectados = 1;
		long populacao, cont = 0, mes, dia, ano;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a popula��o da regi�o: ");
		populacao = teclado.nextLong();
		do {
			infectados += infectados * 0.003;
			cont++;
		} while (populacao > infectados);
		ano = cont / 365;
		mes = cont % 365 / 30;
		dia = -(ano * 365 + mes * 30) + cont;
		System.out.println("O tempo necess�rio para toda a popula��o estar� infectada com o v�rus � de " + ano
				+ " ano/anos, " + mes + " m�s/meses e " + dia + " dia/dias.");
		teclado.close();
	}
}

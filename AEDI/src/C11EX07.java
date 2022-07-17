import java.util.Scanner;

public class C11EX07 {
	public static void main(String[] args) {
		int cont = 0, cont2 = 0, diasMaior;
		float temp = 0, tempMaior = 0, tempMenor = 0, media, soma = 0;
		Scanner teclado = new Scanner(System.in);
		while (cont < 10) {
			cont++;
			System.out.print("Informe a temperatura do dia " + cont + ": ");
			temp = teclado.nextFloat();
			soma += temp;
			if (cont == 1 || temp < tempMenor) {
				tempMenor = temp;
			} else if (cont == 1 || temp > tempMaior) {
				tempMaior = temp;
			} else if (cont == 1 || temp == tempMaior)
				cont2++;
		}
		diasMaior = cont2 + 1;
		media = (float) soma / cont;
		System.out.println("A menor temperatura registrada é de " + tempMenor);
		System.out.println("A maior temperatura registrada é de " + tempMaior);
		System.out.println("A média das temperaturas registradas é de " + media);
		System.out.println("A quantidade de dias que ocorreu a maior temperatura é " + diasMaior);
		teclado.close();
	}
}

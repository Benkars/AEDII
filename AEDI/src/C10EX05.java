import java.util.Scanner;

public class C10EX05 {
	public static void main(String[] args) {
		float peso, altura, soma = 0, mediaAltura;
		String sexo;
		int cont = 0, cont2 = 0, cont3 = 0, total;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe a sua altura em metros: ");
			altura = teclado.nextFloat();
			if (altura != 0) {
				System.out.print("Informe o seu peso em quilos: ");
				peso = teclado.nextFloat();
				System.out.print("Informe o seu sexo (M para masculino e F para feminino): ");
				teclado.nextLine();
				sexo = teclado.nextLine();
				if (sexo.equalsIgnoreCase("F")) {
					cont++;
					if (peso < 60) {
						cont2++;
					}
				} else {
					soma += altura;
					cont3++;
				}
			}
		} while (altura != 0);
		total = cont3 + cont;
		mediaAltura = (float) soma / cont3;
		System.out.println("A quantidade de pessoas pesquisadas é de " + total);
		System.out.println("A quantidade de mulheres é de " + cont);
		System.out.println("A altura média dos homens é de " + mediaAltura + " metros");
		System.out.println("A Quantidade de mulheres com peso menor que 60 é de " + cont2);
		teclado.close();
	}
}

import java.util.Scanner;

public class C8EX05 {
	public static void main(String[] args) {
		int voto, cont1 = 0, cont2 = 0, cont3 = 0;
		Scanner teclado = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o número do candidato: ");
			voto = teclado.nextInt();
			if (voto == 1) {
				cont1++;
			} else {
				if (voto == 2) {
					cont2++;
				} else {
					if (voto == 3) {
						cont3++;

					}
				}
			}
		}
		if (cont1 > cont2 && cont1 > cont3) {
			System.out.println("O vencedor das eleições municipais é Fulano, com o total de votos igual a " + cont1);
		} else {
			if (cont1 < cont2 && cont2 > cont3) {
				System.out
						.println("O vencedor das eleições municipais é Ciclano, com o total de votos igual a " + cont2);
			} else {
				if (cont3 > cont2 && cont1 < cont3) {
					System.out.println(
							"O vencedor das eleições municipais é Beltrano, com o total de votos igual a " + cont3);
				}
			}
		}
		teclado.close();
	}

}

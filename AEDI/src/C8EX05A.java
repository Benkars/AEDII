import java.util.Scanner;

public class C8EX05A {
	public static void main(String[] args) {
		int voto = 0, fulano = 0, ciclano = 0, beltrano = 0, nulo = 0;
		Scanner teclado = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o número do candidato: ");
			voto = teclado.nextInt();
			switch (voto) {
			case 1:
				fulano++;
				break;
			case 2:
				ciclano++;
				break;
			case 3:
				beltrano++;
				break;
			default:
				nulo++;
				break;
			}
		}
		System.out.println("A quantidade de votos do Fulano é igual a " + fulano);
		System.out.println("A quantidade de votos do Ciclano é igual a " + ciclano);
		System.out.println("A quantidade de votos do Beltrano é igual a " + beltrano);
		System.out.println("A quantidade de votos nulos é igual a " + nulo);
		if (fulano == ciclano) {
			System.out.println("Haverá segundo turno nas eleições entre Fulano e Ciclano ");
			beltrano = 0;
			ciclano = 0;
			fulano = 0;
			nulo = 0;
			for (int i = 1; i <= 5; i++) {
				System.out.println("Informe o número do candidato: ");
				voto = teclado.nextInt();
				switch (voto) {
				case 1:
					fulano++;
					break;
				case 2:
					ciclano++;
					break;
				default:
					nulo++;
					break;
				}
			}
		}
		if (fulano == beltrano) {
			System.out.println("Haverá segundo turno nas eleições entre Fulano e Beltrano ");
			beltrano = 0;
			ciclano = 0;
			fulano = 0;
			nulo = 0;
			for (int i = 1; i <= 5; i++) {
				System.out.println("Informe o número do candidato: ");
				voto = teclado.nextInt();
				switch (voto) {
				case 1:
					fulano++;
					break;
				case 3:
					beltrano++;
					break;
				default:
					nulo++;
					break;
				}
			}

		}
		if (ciclano == beltrano) {
			System.out.println("Haverá segundo turno entre Ciclano e Beltrano.");
			beltrano = 0;
			ciclano = 0;
			fulano = 0;
			nulo = 0;
			for (int i = 1; i <= 5; i++) {
				System.out.println("Informe o número do candidato: ");
				voto = teclado.nextInt();
				switch (voto) {
				case 3:
					beltrano++;
					break;
				case 2:
					ciclano++;
					break;
				default:
					nulo++;
					break;
				}
			}
		}
		if (ciclano == beltrano && ciclano == fulano && ciclano + fulano + beltrano > nulo) {
			System.out.println("Haverá segundo turno triplo, entre os candidatos Fulano, Ciclano e Beltrano.");
			beltrano = 0;
			ciclano = 0;
			fulano = 0;
			nulo = 0;
			for (int i = 1; i <= 5; i++) {
				System.out.println("Informe o número do candidato: ");
				voto = teclado.nextInt();
				switch (voto) {
				case 3:
					beltrano++;
					break;
				case 2:
					ciclano++;
					break;
				case 1:
					fulano++;
					break;
				default:
					nulo++;
					break;
				}
			}
		}
		if (fulano + ciclano + beltrano < nulo) {
			System.out.println("A eleição municipal foi anulada.");
		} else {
			if (fulano > 5) {
				System.out.println("O vencedor do eleição é Fulano com o total de " + fulano + " votos.");
			} else {
				if (ciclano > 5) {
					System.out.println("O vencedor do eleição é Ciclano com o total de " + ciclano + " votos.");
				} else {
					if (beltrano > 5) {
						System.out.println("O vencedor do eleição é Beltrano com o total de " + beltrano + " votos.");
					}
				}
			}
		}
		teclado.close();
	}
}


import java.util.Scanner;

public class C6EX11 {
	public static void main(String[] args) {
		String equipe1, equipe2;
		int pontosEquipe1 = 0, pontosEquipe2 = 0, sets1, sets2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o nome da primeira equipe: ");
		equipe1 = teclado.next();
		System.out.print("Informe o nome da segunda equipe: ");
		equipe2 = teclado.next();
		System.out.print("Informe o sets da primeira equipe: ");
		sets1 = teclado.nextInt();
		System.out.print("Informe o sets da segunda equipe: ");
		sets2 = teclado.nextInt();
		if (sets1 == 3 && sets2 == 2) {
			pontosEquipe1 = 2;
			pontosEquipe2 = 1;
		} else {
			if (sets1 == 2 && sets2 == 3) {
				pontosEquipe1 = 1;
				pontosEquipe2 = 2;
			} else {
				if (sets1 == 3 && sets2 == 0) {
					pontosEquipe1 = 3;
					pontosEquipe2 = 0;
				}
				else 
					if (sets1 == 0 && sets2 ==3) {
						pontosEquipe1 = 0;
						pontosEquipe2 = 3;
					}
			}
		}
		
		System.out.printf("Os pontos do(a) %s = %d \nOs pontos do(a) %s = %d", equipe1, pontosEquipe1, equipe2,
				pontosEquipe2);

		teclado.close();

	}

}

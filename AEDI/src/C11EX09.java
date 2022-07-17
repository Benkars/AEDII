import java.util.Scanner;

public class C11EX09 {
	public static void main(String[] args) {
		int RF = 1, ano, setor, admissão, cont = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, anoMaior = 0,
				admissãoMaior = 0, admissãoMenor = 0, anoMenor = 0;
		String nome, nomeNovo = "", nomeVelho = "", setorMaior = "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 0 quando for perguntado seu RF para encerrar o programa.");
		while (RF != 0) {
			System.out.print("Informe o seu RF (registro funcional): ");
			RF = teclado.nextInt();
			if (RF == 0)
				break;
			cont++;
			teclado.nextLine();
			System.out.print("Informe o seu nome: ");
			nome = teclado.nextLine();
			ano = RF / 10000;
			setor = RF / 1000 % 10;
			admissão = RF % 1000;
			if (RF < 100000 || RF > 999999 || ano > 14 || ano < 10 || setor > 4 || setor < 1) {
				System.out.println("REGISTRO INVÁLIDO !!!");
				continue;
			}
			if (cont == 1 || admissão > admissãoMaior) {
				admissãoMaior = admissão;
			}
			if (cont == 1 || admissão < admissãoMenor) {
				admissãoMenor = admissão;
			}
			switch (setor) {
			case 1:
				cont2++;
				break;
			case 2:
				cont3++;
				if (ano == 10)
					cont6++;
				break;
			case 3:
				cont4++;
				break;
			case 4:
				cont5++;
				break;
			}
			if (cont == 1 || ano > anoMaior && admissãoMaior > admissão) {
				anoMaior = ano;
				nomeNovo = nome;
			}
			if (cont == 1 || ano < anoMenor && admissãoMenor < admissão) {
				anoMenor = ano;
				nomeVelho = nome;
			}
			if (cont2 > cont3 && cont2 > cont4 && cont2 > cont5)
				setorMaior = "Gerência";
			else if (cont3 > cont2 && cont3 > cont4 && cont3 > cont5)
				setorMaior = "Administração";
			else if (cont4 > cont2 && cont4 > cont3 && cont4 > cont5)
				setorMaior = "Pesquisa";
			else if (cont5 > cont4 && cont5 > cont3 && cont5 > cont2)
				setorMaior = "Obras";
		}
		System.out.println("A quantidade de funcionários no setor\nGerência = " + cont2 + "\nAdministração = " + cont3
				+ "\nPesquisa = " + cont4 + "\nObras = " + cont5);
		System.out.println(
				"A quantidade de funcionários que foram admitidos em 2010 e trabalham na Administração é de " + cont6);
		System.out.println("O nome do setor que tem mais funcionários alocados é " + setorMaior);
		System.out.println("O funcionário " + nomeVelho + " foi o primeiro a ser admitido na empresa.");
		System.out.println("O funcionário " + nomeNovo + " foi o último a ser admitido na empresa.");
		teclado.close();
	}
}

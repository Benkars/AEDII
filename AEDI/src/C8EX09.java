import java.util.Scanner;

public class C8EX09 {
	public static void main(String[] args) {
		String sexo, nome;
		int rep, idade, soma1 = 0, soma2 = 0, cont1 = 0, cont2 = 0;
		double mediaM, mediaF;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o n�mero de pessoas: ");
		rep = teclado.nextInt();
		teclado.nextLine();
		for (int aux = 1; aux <= rep; aux++) {
			System.out.print("Informe o nome do usu�rio: ");
			nome = teclado.nextLine();
			System.out.print("Informe a idade do usu�rio: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Informe o sexo do usu�rio: ");
			sexo = teclado.nextLine();
			if (sexo.equalsIgnoreCase("M")) {
				soma1 += idade;
				cont1++;
			} else {
				if (sexo.equalsIgnoreCase("F")) {
					soma2 += idade;
					cont2++;
				}
			}
		}
		mediaM = (float) soma1 / cont1;
		mediaF = (float) soma2 / cont2;
		System.out.println("A m�dia das idades dos homens � de " + mediaM);
		System.out.println("A m�dia das idades das mulheres � de " + mediaF);
		teclado.close();
	}

}

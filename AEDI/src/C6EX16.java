import java.util.Scanner;

public class C6EX16 {
	public static void main(String[] args) {
		int faltas, idade, peso1, peso2;
		double prova1, prova2, prova3, trabalhoFinal, mediaProvas, resultado = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o número de faltas do aluno: ");
		faltas = teclado.nextInt();
		System.out.print("Informe o valor da primeira prova: ");
		prova1 = teclado.nextDouble();
		System.out.print("Informe a nota da segunda prova: ");
		prova2 = teclado.nextDouble();
		System.out.print("Informe a nota da terceira prova: ");
		prova3 = teclado.nextDouble();
		System.out.print("Informe a nota do trabalho final: ");
		trabalhoFinal = teclado.nextDouble();
		System.out.print("Informe a idade do aluno: ");
		idade = teclado.nextInt();
		if (prova1 > prova2 && prova2 > prova3 || prova1 < prova2 && prova1 > prova3) {
			mediaProvas = (prova1 + prova2) / 2;
		} else {
			if (prova2 > prova3 && prova3 > prova1 || prova2 < prova3 && prova2 > prova1) {
				mediaProvas = (prova2 + prova3) / 2;
			} else {
				mediaProvas = (prova1 + prova3) / 2;
			}
		}
		if (faltas <= 5) {
			peso1 = 3;
		} else {
			if (faltas > 5 && faltas <= 10) {
				peso1 = 2;
			} else {
				peso1 = 1;
			}
			if (idade <= 17) {
				peso2 = 1;
			} else {
				if (idade >= 18 && idade <= 50) {
					peso2 = 2;
				} else {
					peso2 = 3;
				}
				resultado = peso1 * mediaProvas + peso2 * trabalhoFinal;
			}
		}
		if (resultado <= 50) {
			System.out.println("Reprovado");
		} else {
			if (resultado > 50 && resultado <= 70) {
				System.out.println("Regular");
			} else {
				if (resultado > 70 && resultado <= 80) {
					System.out.println("Bom");
				} else {
					if (resultado > 80 && resultado <= 90) {
						System.out.println("Muito Bom");
					} else {
						System.out.println("Excelente");
					}
				}
			}
		}

		teclado.close();

	}

}

import java.util.Scanner;

public class C8EX12 {
	public static void main(String[] args) {
		int codigo, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		double faturamento = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 1000; aux++) {
			System.out.print("Informe o código do seu equipamento: ");
			codigo = teclado.nextInt();
			switch (codigo) {
			case 1:
				cont1++;
			case 2:
				cont2++;
			case 3:
				cont3++;
			case 4:
				cont4++;
			case 5:
				cont5++;
			}
			faturamento = 1565 * cont1 + 1890 * cont2 + 2150 * cont3 + 2963 * cont4 + 3750 * cont5;
		}
		System.out.println("O faturamneto da empresa é de R$" + faturamento);
		teclado.close();
	}
}

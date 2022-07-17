import java.util.Scanner;

public class C11EX08 {
	public static void main(String[] args) {
		int horaTrab = 0, produtividade = 0, totalHora = 0, cont = 0, cont2 = 0, cont3 = 0, cont4 = 0;
		String nome = "", funcao, funcaoMaior = "", nomeMaior = "";
		double valorHoraTrab, total, mediaHora, totalMaior = 0, folha = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite FIM quando for perguntado o nome do trabalhador para encerrar o programa!");
		System.out.print("Informe o valor da hora trabalhada do projeto em reais: ");
		valorHoraTrab = teclado.nextDouble();
		while (!nome.equalsIgnoreCase("fim")) {
			teclado.nextLine();
			System.out.print("Informe o nome do trabalhador: ");
			nome = teclado.nextLine();
			if (nome.equalsIgnoreCase("FIM"))
				break;
			System.out.print("Informe a função do trabalhador: ");
			funcao = teclado.nextLine();
			System.out.print("Informe a quantidade de horas trabalhadas: ");
			horaTrab = teclado.nextInt();
			totalHora += horaTrab;
			cont++;
			if (horaTrab <= 100) {
				cont2++;
				produtividade = 1000;
			} else if (horaTrab > 100 && horaTrab <= 500) {
				produtividade = 10 * horaTrab;
				cont3++;
			} else {
				produtividade = 100 * (horaTrab / 10);
				cont4++;
			}
			total = horaTrab * valorHoraTrab + produtividade;
			folha += total;
			if (cont == 1 || total > totalMaior) {
				totalMaior = total;
				funcaoMaior = funcao;
				nomeMaior = nome;
			}
			System.out.println("O valor a ser recebido pelo trabalhaodor " + nome + " é de R$" + total);
		}
		mediaHora = (float) totalHora / cont;
		System.out.println("A média de horas trabalhadas por pessoa no projeto é de " + mediaHora);
		System.out.println(
				"O trabalhador " + nomeMaior + ", que exerce a função " + funcaoMaior + " possui o maior salário.");
		System.out.println("Existem " + cont2 + " trabalhadores que recebem o primeiro prêmio produtividade.\nExistem "
				+ cont3 + " trabalhadores que recebem o segundo prêmio produtividade.\nExistem " + cont4
				+ " trabalhadores que recebem o terceiro prêmio produtividade.");
		System.out.println("O valor total da folha de pagamento é de R$" + folha);
		teclado.close();
	}
}

import java.util.Scanner;

public class C6EX12 {
	public static void main(String[] args) {
		int bolasProduziadas, bolasDescarte, meses;
		double caixaPapelaoPreco, aluguel, custoTotal, caixaPapelao, galpao;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o n�mero de bolas de futrebol produzidas: ");
		bolasProduziadas = teclado.nextInt();
		System.out.print("Informe o n�mero de bolas de futrebol que ir�o ser descartadas: ");
		bolasDescarte = teclado.nextInt();
		System.out.print("Informe o valor unit�rio em reais das caixas de papel�o: ");
		caixaPapelaoPreco = teclado.nextDouble();
		System.out.print("Informe o tempo em meses at� a Copa do Mundo: ");
		meses = teclado.nextInt();
		System.out.print("Informe o valar mensal do aluguel em reais: ");
		aluguel = teclado.nextDouble();
		caixaPapelao = (bolasProduziadas - bolasDescarte) / 10.0;
		caixaPapelao = Math.ceil(caixaPapelao);
		galpao = caixaPapelao / 850.0;
		galpao = Math.ceil(galpao);
		custoTotal = caixaPapelao * caixaPapelaoPreco + meses * aluguel * galpao;
		System.out.printf("O custo total em reais � de %1.2f", custoTotal);
		teclado.close();

	}

}

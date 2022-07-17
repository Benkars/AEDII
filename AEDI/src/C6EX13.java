import java.util.Scanner;

public class C6EX13 {
	public static void main(String[] args) {
		int horasInicio, horasFim, duracaoMinutos, duracaoHoras, minutoInicio, minutoFim;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe em que horas o ocorreu o início do jogo: ");
		horasInicio = teclado.nextInt();
		System.out.print("Informe em que minutos o ocorreu o início do jogo: ");
		minutoInicio = teclado.nextInt();
		System.out.print("Informe em que horas o ocorreu o final do jogo: ");
		horasFim = teclado.nextInt();
		System.out.print("Informe em que minutos o ocorreu o final do jogo: ");
		minutoFim = teclado.nextInt();
		duracaoMinutos = minutoFim - minutoInicio;
		duracaoHoras = horasFim - horasInicio;
		if (minutoFim < minutoInicio)
			duracaoHoras = duracaoHoras - 1;
		if (duracaoMinutos < 0) {
			duracaoMinutos = duracaoMinutos * -1;
		}

		System.out.printf("A duração do jogo foi de %d:%d.", duracaoHoras, duracaoMinutos);

		teclado.close();

	}

}

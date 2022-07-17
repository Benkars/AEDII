import java.util.Scanner;

public class C8EX16 {
	public static void main(String[] args) {
		double funcao;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 3; aux <= 12; aux++) {
			funcao = Math.sqrt(Math.pow(aux, 2) - 3);
			System.out.println("O valor da função F(x) é de " + funcao + " quando X vale " + aux);
		}
		teclado.close();
	}
}

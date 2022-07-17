import java.util.Scanner;

public class C5ex11 {
	public static void main(String[] args) {
		long numeroDoCheque, resto1, resto2, resto3;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Informe o número do cheque: ");
		numeroDoCheque=teclado.nextLong();
		resto1=numeroDoCheque/1000000;
		resto2=numeroDoCheque/1000%1000;
		resto3=numeroDoCheque%1000;
		System.out.println("Banco = "+resto1);
		System.out.println("Agência = "+resto2);
		System.out.println("Sequencial = "+resto3);
		teclado.close();
		
	}

}
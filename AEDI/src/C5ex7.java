import java.util.Scanner;

public class C5ex7 {
	public static void main(String[] args) {
		double x, valorDaFuncao;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Informe o valor de X: ");
		x=teclado.nextDouble();
		valorDaFuncao = Math.sqrt(Math.pow(x/4+1,2)+1*x/5);
		System.out.print("O valor da função F(x) é de "+valorDaFuncao);
		teclado.close();
		
	}

}

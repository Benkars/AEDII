import java.util.Scanner;

public class C5ex4 {
	public static void main(String[] args) {
		double x1,x2,y1,y2,distancia;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Informe o valor de X no ponto 1: ");
		x1=teclado.nextDouble();
		System.out.print("Informe o valor de Y no ponto 1: ");
		y1=teclado.nextDouble();
		System.out.print("Informe o valor de X no ponto 2: ");
		x2=teclado.nextDouble();
		System.out.print("Informe o valor de Y no ponto 2; ");
		y2=teclado.nextDouble();
		distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2,2));
		System.out.print("O valor da distância é de "+ distancia);
		teclado.close();
		
	}

}

	


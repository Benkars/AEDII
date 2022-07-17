import java.util.Scanner;

public class C5ex2 {
	public static void main(String[] args) {
		double raio, pi, area, volume;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Informe o valor do raio da esfera: ");
		raio = teclado.nextDouble();
		pi = 3.1416;
		area = 4*pi* Math.pow(raio,2);
		volume = Math.pow(raio,3)*pi*4/3.0;
		System.out.println("Área da esfera = " +area);
		System.out.println("Volume da esfera =" +volume);
		teclado.close();
		
	}

}

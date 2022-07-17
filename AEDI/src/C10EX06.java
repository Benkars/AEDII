import java.util.Scanner;

public class C10EX06 {
	public static void main(String[] args) {
		double a, b, c, x, y, distancia;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Informe a o valor de A da reta: ");
			a = teclado.nextDouble();
			System.out.print("Informe a o valor de B da reta: ");
			b = teclado.nextDouble();
			System.out.print("Informe a o valor de C da reta: ");
			c = teclado.nextDouble();
			System.out.print("Informe a coordenada de Xo: ");
			x = teclado.nextDouble();
			System.out.print("Informe a coordenada de Yo: ");
			y = teclado.nextDouble();
			distancia = (a * x + b * y + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			System.out.println("A distância entre o ponto P e a reta é " + distancia);
		} while (distancia != 0);
		System.out.println("As coordenadas Xo e Yo que coincidem com a reta são: " + x + " " + y);
		teclado.close();
	}
}

import java.util.Scanner;

public class RetanguloEstruturado {
	public static void main(String[] args) {
		double base, altura, area, perimetro;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o valor da base: ");
		base = teclado.nextDouble();
		System.out.print("Informe o valor da altura: ");
		altura = teclado.nextDouble();
		
		area = base * altura;
		perimetro = (base + altura) * 2;
		
		System.out.printf("Área: %.2f m2\n", area);
		System.out.printf("Perímetro: %.2f m\n", perimetro);
		teclado.close();
	}
}
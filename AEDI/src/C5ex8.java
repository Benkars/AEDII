import java.util.Scanner;

public class C5ex8 {
	public static void main(String[] args) {
		double s,angulo,raio,pi;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Informe o valor de S(�rea de um setor circular): ");
		s=teclado.nextDouble();
		System.out.print("Informe o valor de �ngulo: ");
		angulo=teclado.nextDouble();
		pi=3.1416;
		raio= Math.sqrt((s*360.0)/(pi*angulo));
		System.out.print("O valor do raio � de : "+raio);		
		teclado.close();
		
	}

}

import java.util.Scanner;

public class C5ex6 {
	public static void main(String[] args) {
		double a,b,c,x,y,distancia;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Informe o valor do coeficiente A da reta: ");
		a=teclado.nextDouble();
		System.out.print("Informe o valor do coeficiente B da reta: ");
		b=teclado.nextDouble();
		System.out.print("Informe o valor do coeficiente C da reta: ");
		c=teclado.nextDouble();
		System.out.print("Informe o valor de X no ponto P: ");
		x=teclado.nextDouble();
		System.out.print("Informe o valor de Y no ponto P: ");
		y=teclado.nextDouble();
		distancia= ((a*x)+(b*y)+c)/Math.sqrt(Math.pow(a,2)+ Math.pow(b, 2));
		System.out.println("O valor da distância é de "+distancia);
		teclado.close();
		
	}

}

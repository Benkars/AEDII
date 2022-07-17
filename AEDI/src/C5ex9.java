import java.util.Scanner;

public class C5ex9 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Informe a nota da primeira prova: ");
		nota1=teclado.nextDouble();
		System.out.print("Informe a nota da segunda prova: ");
		nota2=teclado.nextDouble();
		System.out.print("Informe a nota da terceira prova: ");
		nota3=teclado.nextDouble();
		media=((nota1*2)+(nota2*3)+(nota3*5))/10.0;
		System.out.print("O valor da média ponderada das provas é de "+media);
		teclado.close();
	
	}

}

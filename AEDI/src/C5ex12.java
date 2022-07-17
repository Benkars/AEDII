import java.util.Scanner;

public class C5ex12 {
	public static void main(String[] args) {
		int horas, minutos, segundos;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Escreva o tempo de duração do evento em segundos: ");
		segundos=teclado.nextInt();
		horas = segundos/3600;
		segundos = segundos % 3600;
		minutos = segundos/60;
		segundos = segundos%60 ;
		System.out.print("O tempo em horas, minutos e segundos são respectivamente = "+horas+", "+minutos+" e "+segundos);
		teclado.close();
	
	}

}

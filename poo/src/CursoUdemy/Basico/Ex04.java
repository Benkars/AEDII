package CursoUdemy.Basico;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int numeroFuncionario, horas;
        float salario, valorHora;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu número: ");
        numeroFuncionario = teclado.nextInt();
        System.out.println("Informe o número de horas trabalhadas: ");
        horas = teclado.nextInt();
        System.out.println("Informe o que recebe por hora: ");
        valorHora = teclado.nextFloat();
        salario = valorHora * horas;
        System.out.println("O valor a ser recebido pelo funcionário de número "
                + numeroFuncionario + " é de " + salario);
        teclado.close();
    }
}
package CursoUdemy.POO.Ex03;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Leitura ler = new Leitura();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        ler.nome = teclado.nextLine();
        System.out.print("Informe a nota do primeiro trimestre: ");
        ler.n1 = teclado.nextFloat();
        System.out.print("Informe a nota do segundo trimestre: ");
        ler.n2 = teclado.nextFloat();
        System.out.print("Informe a nota do primeiro trimestre: ");
        ler.n3 = teclado.nextFloat();

        System.out.println(ler.aprovacao());

        teclado.close();
    }
}
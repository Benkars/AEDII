package CursoUdemy.POO.Ex02;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        float increase = 0;
        Employee empregado = new Employee();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Name: ");
        empregado.name = teclado.nextLine();
        System.out.print("Gross salary: ");
        empregado.grossSalary = teclado.nextDouble();
        System.out.print("Tax: ");
        empregado.tax = teclado.nextDouble();

        System.out.print("Which percentage to increase salary?: ");
        increase = teclado.nextFloat();
        empregado.increaseSalary(increase);

        System.out.println(empregado);


        teclado.close();
    }
}
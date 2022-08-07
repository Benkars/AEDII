package CursoUdemy.While;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int senha;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a senha:");
        senha = teclado.nextInt();
        while (senha != 2002){
            System.out.println("Senha Invalida\nInforme a senha novamente: ");
            senha = teclado.nextInt();
        }
        System.out.println("Acesso Permitido");
        teclado.close();
    }
}
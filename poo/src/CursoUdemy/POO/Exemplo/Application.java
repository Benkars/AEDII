package CursoUdemy.POO.Exemplo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        char sn, ie;
        int quantidade = 0;
        Scanner teclado = new Scanner(System.in);

        Product produto = new Product();

        System.out.print("Entre com os dados do produto: \n" +
                "Name: ");
        produto.name = teclado.nextLine();
        System.out.print("Inforem o valor do produto: ");
        produto.price = teclado.nextDouble();
        System.out.print("Informe a disponibilidade de produto: ");
        produto.quantity = teclado.nextInt();

        System.out.print("Deseja adicionar ou excluir algum item ? S para sim e N para não: ");
        sn = teclado.next().charAt(0);

        if (sn == 'S') {
            System.out.print("Para incluir digite I e para excluir digite E: ");
            ie = teclado.next().charAt(0);
            if (ie == 'I') {
                System.out.println("Informe a quantidade a ser incluída; ");
                quantidade = teclado.nextInt();
                produto.addProduct(quantidade);
            } else {
                System.out.println("Informe a quantidade a ser excluída; ");
                quantidade = teclado.nextInt();
                produto.removeProducts(quantidade);
            }
        }


        System.out.println(produto);

        teclado.close();
    }
}
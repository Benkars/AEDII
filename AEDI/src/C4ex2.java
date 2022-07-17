import java.util.Scanner;

public class C4ex2 {
	public static void main(String[] args) {
	String nome, empresa, cpf, carteiraIdentidade;
	long carteiraMotorista, tituloEleitor;
	double salario;
	Scanner teclado = new Scanner (System.in);
	System.out.print("Informe seu nome completo: ");
	nome = teclado.nextLine();
	System.out.print("Informe o nome da empresa: ");
	empresa = teclado.nextLine();
	System.out.print("Informe seu cpf: ");
	cpf = teclado.nextLine();
	System.out.print("Informe sua carteira de identidade: ");
	carteiraIdentidade = teclado.nextLine();
	System.out.print("Informe sua carteira de motorista: ");
	carteiraMotorista = teclado.nextLong();
	System.out.print("Informe seu tílulo de eleitor: ");
	tituloEleitor =  teclado.nextLong();
	System.out.print("Informe o seu salário: ");
	salario = teclado.nextDouble();
	System.out.println("FICHA FUNCIONAL DE: " +nome);
	System.out.println("Documentos:");
	System.out.println("CPF......................."+ cpf);
	System.out.println("C.I......................." +carteiraIdentidade);
	System.out.println("Título de eleitor........." +tituloEleitor);
	System.out.println("Carteira de motorista....." +carteiraMotorista);
	System.out.println();
	System.out.println("Empresa: " +empresa);
	System.out.println("Salário: R$" +salario);
	teclado.close();
	}
}

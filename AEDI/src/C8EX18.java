
public class C8EX18 {
	public static void main(String[] args) {
		double funcao, soma = 0;
		for (int aux = 1; aux <= 100; aux++) {
			funcao = Math.pow(aux, 2);
			soma += funcao;
			System.out.println(funcao);
		}
		System.out.println("A soma dos primeiros 100 termos equivale a " + soma);
	}
}

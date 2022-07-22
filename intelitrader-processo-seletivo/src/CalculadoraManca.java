import java.util.Scanner;

public class CalculadoraManca {
	
	int primeiroNumero, segundoNumero;
	
	Scanner teclado = new Scanner(System.in);
	
	public void exibeOperacoes() {
		System.out.println("----------|OPERAÇÕES|----------");
		System.out.println("Opção 1 - Soma.");
		System.out.println("Opção 2 - Subtração.");
		System.out.println("Opção 3 - Divisão.");
		System.out.println("Opção 4 - Multiplicação.");
		System.out.println("Opção 5 - Potência.");
		System.out.println("Opção 6 - Radiação.");
		System.out.println("------------------------------");
		
		System.out.print("\nDigite a operação desejada: ");
		int operacao = teclado.nextInt();
		
		switch (operacao) {
			case 1:
				System.out.println("\n----------|SOMA|----------");
				System.out.print("Digite o primeiro número: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.print("Digite o segundo número: ");
				this.segundoNumero = teclado.nextInt();
				
				System.out.println("A soma dos dois números digitados é " + Math.addExact(this.primeiroNumero, this.segundoNumero));
			break;
		}
	}
	
	public static void main(String[] args) {
		CalculadoraManca calcula = new CalculadoraManca();
		calcula.exibeOperacoes();
	}
}

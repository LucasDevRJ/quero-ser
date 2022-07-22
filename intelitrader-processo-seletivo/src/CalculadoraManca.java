//link do exercício:https://dojopuzzles.com/problems/calculadora-manca/

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
				
				System.out.println("--------------------------------");
			break;
			
			case 2:
				System.out.println("\n----------|SUBTRAÇÃO|----------");
				System.out.print("Digite o primeiro número: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.print("Digite o segundo número: ");
				this.segundoNumero = teclado.nextInt();
				
				System.out.println("A subtração dos dois números digitados é " + Math.subtractExact(this.primeiroNumero, this.segundoNumero));
				
				System.out.println("--------------------------------");
			break;
			
			case 3:
				System.out.println("\n----------|DIVISÃO|----------");
				System.out.print("Digite o primeiro número: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.print("Digite o segundo número: ");
				this.segundoNumero = teclado.nextInt();
				
				System.out.println("A divisão dos dois números digitados é " + this.primeiroNumero / this.segundoNumero);
				
				System.out.println("--------------------------------");
			break;
			
			case 4:
				System.out.println("\n----------|MULTIPLICAÇÃO|----------");
				System.out.print("Digite o primeiro número: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.print("Digite o segundo número: ");
				this.segundoNumero = teclado.nextInt();
				
				System.out.println("A multiplicação dos dois números digitados é " + Math.multiplyExact(this.primeiroNumero, this.segundoNumero));
				
				System.out.println("--------------------------------");
			break;
			
			case 5:
				System.out.println("\n----------|POTÊNCIA|----------");
				System.out.print("Digite o primeiro número: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.print("Digite o segundo número: ");
				this.segundoNumero = teclado.nextInt();
				
				System.out.println("A potência dos dois números digitados é " + Math.pow(this.primeiroNumero, this.segundoNumero));
				
				System.out.println("--------------------------------");
			break;
			
			case 6:
				System.out.println("\n----------|RADIAÇÃO|----------");
				System.out.print("Digite o número: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.println("A radiação do número digitado é " + Math.sqrt(this.primeiroNumero));
				
				System.out.println("--------------------------------");
			break;
			
			default:
				System.out.println("\nOpção inválida!");
				exibeOperacoes();
			break;
		}
	}
	
	public static void main(String[] args) {
		CalculadoraManca calcula = new CalculadoraManca();
		calcula.exibeOperacoes();
	}
}

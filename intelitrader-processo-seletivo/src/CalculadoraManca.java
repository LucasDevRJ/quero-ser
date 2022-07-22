//link do exerc�cio:https://dojopuzzles.com/problems/calculadora-manca/

import java.util.Scanner;

public class CalculadoraManca {
	
	int primeiroNumero, segundoNumero;
	
	Scanner teclado = new Scanner(System.in);
	
	public void exibeOperacoes() {
		System.out.println("----------|OPERA��ES|----------");
		System.out.println("Op��o 1 - Soma.");
		System.out.println("Op��o 2 - Subtra��o.");
		System.out.println("Op��o 3 - Divis�o.");
		System.out.println("Op��o 4 - Multiplica��o.");
		System.out.println("Op��o 5 - Pot�ncia.");
		System.out.println("Op��o 6 - Radia��o.");
		System.out.println("------------------------------");
		
		System.out.print("\nDigite a opera��o desejada: ");
		int operacao = teclado.nextInt();
		
		switch (operacao) {
			case 1:
				System.out.println("\n----------|SOMA|----------");
				System.out.print("Digite o primeiro n�mero: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.print("Digite o segundo n�mero: ");
				this.segundoNumero = teclado.nextInt();
				
				System.out.println("A soma dos dois n�meros digitados � " + Math.addExact(this.primeiroNumero, this.segundoNumero));
				
				System.out.println("--------------------------------");
			break;
			
			case 2:
				System.out.println("\n----------|SUBTRA��O|----------");
				System.out.print("Digite o primeiro n�mero: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.print("Digite o segundo n�mero: ");
				this.segundoNumero = teclado.nextInt();
				
				System.out.println("A subtra��o dos dois n�meros digitados � " + Math.subtractExact(this.primeiroNumero, this.segundoNumero));
				
				System.out.println("--------------------------------");
			break;
			
			case 3:
				System.out.println("\n----------|DIVIS�O|----------");
				System.out.print("Digite o primeiro n�mero: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.print("Digite o segundo n�mero: ");
				this.segundoNumero = teclado.nextInt();
				
				System.out.println("A divis�o dos dois n�meros digitados � " + this.primeiroNumero / this.segundoNumero);
				
				System.out.println("--------------------------------");
			break;
			
			case 4:
				System.out.println("\n----------|MULTIPLICA��O|----------");
				System.out.print("Digite o primeiro n�mero: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.print("Digite o segundo n�mero: ");
				this.segundoNumero = teclado.nextInt();
				
				System.out.println("A multiplica��o dos dois n�meros digitados � " + Math.multiplyExact(this.primeiroNumero, this.segundoNumero));
				
				System.out.println("--------------------------------");
			break;
			
			case 5:
				System.out.println("\n----------|POT�NCIA|----------");
				System.out.print("Digite o primeiro n�mero: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.print("Digite o segundo n�mero: ");
				this.segundoNumero = teclado.nextInt();
				
				System.out.println("A pot�ncia dos dois n�meros digitados � " + Math.pow(this.primeiroNumero, this.segundoNumero));
				
				System.out.println("--------------------------------");
			break;
			
			case 6:
				System.out.println("\n----------|RADIA��O|----------");
				System.out.print("Digite o n�mero: ");
				this.primeiroNumero = teclado.nextInt();
				
				System.out.println("A radia��o do n�mero digitado � " + Math.sqrt(this.primeiroNumero));
				
				System.out.println("--------------------------------");
			break;
			
			default:
				System.out.println("\nOp��o inv�lida!");
				exibeOperacoes();
			break;
		}
	}
	
	public static void main(String[] args) {
		CalculadoraManca calcula = new CalculadoraManca();
		calcula.exibeOperacoes();
	}
}

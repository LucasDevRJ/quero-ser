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
			break;
		}
	}
	
	public static void main(String[] args) {
		CalculadoraManca calcula = new CalculadoraManca();
		calcula.exibeOperacoes();
	}
}

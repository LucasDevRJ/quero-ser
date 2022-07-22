//link: https://dojopuzzles.com/problems/problema-do-miojo/
import java.util.Scanner;

public class Miojo {

	int tempoPrimeiraAmpulheta, tempoSegundaAmpulheta, tempoNecessario, troca;
	
	Scanner teclado = new Scanner(System.in);
	
	public void calculaTempoMiojo() {
		System.out.println("É preciso somente de 3 minutos para o miojo ficar pronto.");
		
		System.out.print("\nDigite o tempo (em minutos) da primeira ampulheta: ");
		this.tempoPrimeiraAmpulheta = teclado.nextInt();
		
		System.out.print("\nDigite o tempo (em minutos) da segunda ampulheta: ");
		this.tempoSegundaAmpulheta = teclado.nextInt();
		
		if (this.tempoSegundaAmpulheta > this.tempoPrimeiraAmpulheta) {
			this.troca = this.tempoSegundaAmpulheta;
			this.tempoSegundaAmpulheta = this.tempoPrimeiraAmpulheta;
			this.tempoPrimeiraAmpulheta = this.troca;
		}
		
		this.tempoNecessario = this.tempoPrimeiraAmpulheta - this.tempoSegundaAmpulheta;
		
		if (this.tempoNecessario == 3) {
			System.out.println("\nO tempo é suficiente para o miojo ficar pronto.");
		} else {
			System.out.println("\nNão é possível cozinhar o miojo no tempo exato com as ampulhetas disponíveis.");
		}
	} 
	
	public static void main(String[] args) {
		Miojo miojo = new Miojo();
		miojo.calculaTempoMiojo();
	}
	
}

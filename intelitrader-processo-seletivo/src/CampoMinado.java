//Link do exercício: https://dojopuzzles.com/problems/campo-minado/
import java.util.Scanner;

public class CampoMinado {

	int matriz;
	int contador = 0;
	
	Scanner entrada = new Scanner(System.in);
	
	public void digiteTamanhoCampo() {
		System.out.print("Digite o número da matriz: ");
		this.matriz = entrada.nextInt();
		
		for (int l = 0; l < this.matriz; l++) {
			for (int c = 0; c < this.matriz; c++) {
				if (contador % 8 == 0) {
					System.out.print("*");
					
				} else {
					System.out.print(".");
				}
				contador++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		CampoMinado campo = new CampoMinado();
		campo.digiteTamanhoCampo();
	}
}

import java.util.Scanner;

public class QuadradoDeUmNumero {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		Integer numero = scanner.nextInt();
				
		Integer QuadradoDoNumero = numero * numero;
							
		System.out.println("O quadrado de " + numero + " é: " + QuadradoDoNumero + " .");
		
		scanner.close();
		
		}

}

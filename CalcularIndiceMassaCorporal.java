	import java.util.Scanner;


public class CalcularIndiceMassaCorporal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu peso (em Kg): ");
			Double PesoAtual = scanner.nextDouble();
		
		System.out.print("Digite sua altura (em metros): ");
			Double Altura = scanner.nextDouble();
		
		Double AlturaAoQuadrado = Altura * Altura;
		
		Double IndiceMassaCorporal =  PesoAtual / AlturaAoQuadrado;
			
		System.out.println("Seu IMC é: " + IndiceMassaCorporal);
		
		scanner.close();
		
	
	}
	
 }
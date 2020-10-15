import java.util.Scanner;

public class NomeESobrenome {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Digite seu nome: ");
	String nome = scanner.nextLine();
	
	System.out.print("Digite seu nome: ");
	String sobrenome = scanner.nextLine();
	
	
	System.out.println("Olá, " + nome + " " + sobrenome + "!" + "Seja bem-vindo!");
	

	scanner.close();
}
	
}
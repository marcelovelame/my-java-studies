import java.util.Scanner;

public class NotaAluno {

	//nota do aluno no console e maior que 70 passa menor reprova.
	
    public static void main (String[] args) {
    	Scanner scanner = new Scanner (System.in);
    	
    	System.out.print("Digite a sua nota: ");
    	Double notaDoAluno = scanner.nextDouble();

	    Boolean passouDeAno = notaDoAluno >= 70;
	    
	    if(passouDeAno) {
	    	System.out.println("Você foi aprovado. Você passou de ano.");
	    	
	    }else {
	    	
	    	System.out.println("Você foi reprovado. Você não passou de ano.");
	    } 
	    
	    scanner.close();
	    
    }	  
}

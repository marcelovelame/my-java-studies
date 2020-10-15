import java.util.Scanner;

public class NotaAlunoConstante {

	final static Integer NotaMinimaPassarDeAno = 70;
	
    public static void main (String[] args) {
    	Scanner scanner = new Scanner (System.in);
    	
    	System.out.print("Digite a sua nota: ");
    	Double notaDoAluno = scanner.nextDouble();

	   	Boolean passouDeAno = notaDoAluno >= NotaMinimaPassarDeAno;
    	
	    if(passouDeAno) {
	    	System.out.println("Você foi aprovado. Você passou de ano.");
	    	
	    }else {
	    	
	    	System.out.println("Você foi reprovado. Você não passou de ano.");
	    } 
	    
	    scanner.close();
	    
    }	  
}
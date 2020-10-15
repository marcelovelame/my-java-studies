import java.util.Scanner;

public class ValorProdutoQuantidade {

    public static void main (String[] args) {
        
    	Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        
        System.out.print("Digite a quantidade: ");
        Integer quantidade = scanner.nextInt();

        Double valorSubtotal = valorProduto * quantidade;
        
        Boolean quantidadeMaiorOuIgualDez = quantidade >= 10; 
        
        Double percentualDesconto = 0.0;
        
        if (quantidadeMaiorOuIgualDez) {
        	
        	percentualDesconto = 10.0;
        	
        }
    
        Double desconto = valorSubtotal * percentualDesconto / 100;
        
        Double valorTotalDesconto = valorSubtotal - desconto;
        
        System.out.println("Valor total: " + valorTotalDesconto);
        
        scanner.close();

    }

}
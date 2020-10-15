import java.util.Scanner;

public class ContribuicaoPrevidencia {

	
	final static Integer IdadeMinimaParaAposentar = 55;

	final static Integer TempoMinimoDeContribuicao = 25;
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite sua idade: ");
			Integer idade = scanner.nextInt();
			
			System.out.print("Digite seu tempo de contribuição: ");
			Integer contribuicao = scanner.nextInt();
			
			Boolean temIdadeParaAposentar = idade >= IdadeMinimaParaAposentar;
			
			Boolean temTempoDeContribuicaoSuficiente = contribuicao >= TempoMinimoDeContribuicao;
			
			Boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicaoSuficiente;
			
			if (podeAposentar) {
				System.out.println("Sim! Você atende aos critérios para aposentadoria. Você pode aposentar!");
				
			}else {
				System.out.println("Você não pode aposentar agora!");
			
			}
		
			scanner.close();
		}	
		
	}
}
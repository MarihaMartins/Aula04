import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
			
		Scanner leitor = new Scanner(System.in);
		
		int idade=0;
		int i=0;
		int qtd;
		int soma=0, media=0;
		
		System.out.println("Quantos alunos existem nessa escola");
		qtd = leitor.nextInt();
		
		
		
		while(i<qtd) {
			System.out.println("Digite sua idade");
			idade = leitor.nextInt();
			soma = soma + idade;
			i = i + 1;
		}
		
		media = soma / qtd;
		System.out.println("A media de idades entre os alunos � " + media);
		leitor.close();
	}

}

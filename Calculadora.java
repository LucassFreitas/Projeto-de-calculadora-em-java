import java.util.Scanner;

	public class Calculadora {

		public static void main (String args[]) {
				
			Scanner sc = new Scanner (System.in);
				
				double n1, n2, soma, subtracao, multiplicacao, divisao;
				int escolha;
				
				System.out.println("\nDigite um número: ");
				n1 = sc.nextDouble();
	
				System.out.println("\nDigite outro número: ");
				n2 = sc.nextDouble();
	
				System.out.println("\nEscolha uma opção: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n");
				escolha = sc.nextInt();
	
				switch (escolha) {
		
				case 1:
				soma = n1 + n2;
				System.out.printf("\nSoma: %.2f\n", soma);
				break;
		
				case 2:
				subtracao = n1 - n2;
				System.out.printf("\nDivisão: %.2f\n", subtracao);
				break;
		
				case 3:
				multiplicacao = n1 * n2;
				System.out.printf("\nMultiplicação: %.2f\n", multiplicacao);
				break;
		
				case 4:
				divisao = n1 / n2;
				System.out.printf("\nDivisão: %.2f\n", divisao);
				break;
		
				default:
				System.out.printf("\nOpção inválida\n");
				
				}
				
			}
	}
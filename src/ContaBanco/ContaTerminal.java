package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println();
		System.out.println("Por favor, digite o número da Agência: ");
		int numeroAgencia = scanner.nextInt(); // dsadsadsad
		
		System.out.println();
		System.out.println("Qual o número de sua conta? ");
		double conta = scanner.nextDouble();
		
		System.out.println();
		System.out.println("Por favor, digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println();
		System.out.println("Ok... Qual o valor para saque? ");
		double saque = scanner.nextDouble();
		
		// dsdsadsadsadasd
		if(numeroAgencia == 1021) {
			System.out.println();
			System.out.println("\nOlá " + nome + ", Obrigado(a) por criar uma conta em nosso banco"
					+ ", sua agência é: " + numeroAgencia + ", conta: " + conta +
					", e seu saldo " + saque + " já está disponível para saque!!");
			System.out.println();
		} else {
			System.out.println();
			System.out.println("Olá " + nome + ", as informações digitadas não conferem," + 
				" lamentamos o inconviniente!!");
			System.out.println();
		
			System.out.println();
		}
	}
}
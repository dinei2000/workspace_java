import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		int opcao;
		double valor;
		
		Conta c1;
		c1 = new Conta();
		c1.setNumeroConta(12345);
		c1.setDigitoVerif(6);
		c1.setNomeTitular("Isidro");
		c1.setCpfTitular("123.456.789-00");
		c1.setSaldo(200.00);
		
		do {
			System.out.println("Bem Vindo ao Banco - O Melhor Banco");
			System.out.println("Digite 1 - Info / 2 Deposito / 3 - Saque / 0 - Encerrar");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println(c1.exibir());
				break;
			case 2:
			    System.out.println("[DEPOSITO] - Digite o Valor");
			    	 valor = teclado.nextDouble();
			    	 c1.depositar(valor);
			    	 break;
			case 3:
				System.out.println("[SAQUE] - Digite o Valor");
				valor = teclado.nextDouble();
				if (c1.sacar(valor)) {
					System.out.println("SAQUE AUTORIZADO");
				
				}
				
				else {
					System.out.println("SEM SALDO");
				}
			case 0:
				System.out.println( "-----Obrigado pela preferencia");
				break;
			default:
				System.out.println( "ERRO - OPÇÃO INVALIDA");
			break;
						
			}
			
		} while (opcao !=0);
		
		teclado.close ();
	}

}

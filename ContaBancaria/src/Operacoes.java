
public class Operacoes {
	public static void main(String[] args) {
		
		ContaCorrente t1;
		ContaCorrente t2;
		
		t1 = new ContaCorrente();
		t2 = new ContaCorrente();
		
		t1.conta_corrente = 12345678;
		t1.dig_verificador = 1;
	    t1.nome = "José Silva";
		t1.cpf = "123,456,789-10";
		t1.saldo = 200.00;
					
		t2.conta_corrente = 987654321;
		t2.dig_verificador = 1;
	    t2.nome = "Manoel Silva";
		t2.cpf = "987.654,321-20";
		t2.saldo = 100.00;
				
		
		t1.exibirInfo();
		System.out.println("\n");
		t2.exibirInfo();
		
		System.out.println("\n");
		
		t1.depositar(50.00);
		t2.depositar(10.00);
		
		t1.exibirInfo();
		System.out.println("\n");
		t2.exibirInfo();
			
		System.out.println("\n");
			
	    t1.sacar(10.00);
		t2.sacar(120.00);
		
		
		t1.exibirInfo();
		System.out.println("\n");
		t2.exibirInfo();
			
		
	
	}
}

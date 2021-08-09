
public class ContaCorrente {

	int conta_corrente;
	int dig_verificador;
	String nome;
	String cpf;
	double saldo;
	
   void exibirInfo()
   {
   System.out.println(" numero da conta: " + conta_corrente);
   System.out.println(" digito verificador: " + dig_verificador);
   System.out.println(" nome do titular:  " + nome);
   System.out.println(" cpf do titular:  " + cpf);
   System.out.println(" saldo atual : " + saldo);
         
   }
   
   void depositar(double valor) {
	   saldo = saldo + valor;
   }
   
   
   void sacar(double valor) {
	   if (saldo >= valor) {
		   saldo = saldo - valor;
		   System.out.println("saque efetuado");
   }
   else {
	   System.out.println("sem saldo");}
	   
	   }
	   
	   }
  
 
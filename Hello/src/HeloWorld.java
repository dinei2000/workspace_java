import java.util.Scanner;

public class HeloWorld {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Hello World!");
		int a;
		System.out.println("Digite o valor de a:");
		a = teclado.nextInt();
		System.out.println("Voce digtou  " + a);
		teclado.close();
		
	}
}

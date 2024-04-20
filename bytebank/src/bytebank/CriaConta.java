package bytebank;

public class CriaConta {

		public static void main(String[] args) {
			
			Conta primeiraConta = new Conta();
			
			primeiraConta.saldo = 200;
			
			System.out.println(primeiraConta.saldo);
			
			Conta segundaConta = new Conta();
			
			segundaConta.saldo = 50;
			
			System.out.println("primeira conta tem o saldo de R$" + primeiraConta.saldo);
			System.out.print("segunda conta tem o saldo de R$" + segundaConta.saldo);

		}
}

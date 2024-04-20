package bytebank;

public class TestaMetodo {

	
		public static void main(String[] args) {
			
			Conta contaDoVictor = new Conta();
			//contaDoVictor.saldo = 0;
			contaDoVictor.deposita(130);
			System.out.println("Você agora tem o saldo de R$" + contaDoVictor.saldo);
			
			Conta contaDaNathalia = new Conta();
			contaDaNathalia.deposita(1000);
			if (contaDaNathalia.transfere(3000, contaDoVictor)) {
				System.out.println("Transferência realizada com sucesso!");
			}else {
				System.out.println("Saldo insuficiente");
			}
			System.out.println(contaDoVictor.saldo);
		}
}

package bytebankcomposto;

public class TestaClasse {
	
	public static void main(String[] args) {
		
		Cliente victor = new Cliente();
		victor.nome = "Victor Paiva";
		victor.cpf = "222.222.222-22";
		victor.profissao = "programador";
		
		Conta contaDoVictor = new Conta();
		contaDoVictor.deposita(100);
		
		
		// associa o cliente a conta
		contaDoVictor.titular = victor;
		
		System.out.println(contaDoVictor);
		
	}

}

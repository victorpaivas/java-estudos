
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadeDePessoas = 2;

		if (idade >= 18) {
			System.out.println("Você é maior de 18 pode entrar");
			System.out.println("Seja bem vindo!");
		} else {

			if (quantidadeDePessoas >= 2) {
				System.out.println("Você não tem 18 anos, porém pode entrar pois está acompanhado");
			} else {
				System.out.println("Infelizmente você não pode entrar.");
			}
		}
	}

}

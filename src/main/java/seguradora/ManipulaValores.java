package seguradora;

import java.util.Scanner;
import enums.TipoPessoa;
import valores.Cliente;

public class ManipulaValores {
	
	Scanner leitor = new Scanner(System.in);
	
	public int obterValor(){
		/**
		 * Método responsável por adquirir um valor do usuário
		 * para que este seja usufruido pelo programa
		 * 
		 */
		int valor = -1;
		System.out.println("Informe a opção que deseja seguir: ");
		while(true){
			valor = leitor.nextInt();
			if (valor > 0)
				break;//Encerra o método no momento que o usuário informa um valor maior que 0
			else
				while(valor < 0) {
				System.out.println("Por Favor, informe uma opção válida:");/*Caso seja informado um número negativo, 
																			o programa requisita ao usuário 
																			um valor maior que zero*/
				valor = leitor.nextInt();
					if(valor > 0)
						return valor;
			}
		}
		
		return valor;
	}

	public void cadastrar() {
		
		Cliente cliente = new Cliente();
		String nome = null;
		String documento = null;
		int opcaos = 0;
		
		System.out.println("---Cadastro de Cliente---");
		System.out.println("1 - Nome Completo:");
		nome = leitor.next();
		cliente.setNome(nome);
		System.out.println("2 - Tipo de Pessoa:");
		System.out.println("   1 - Pessoa Física");
		System.out.println("   2 - Pessoa Juridica");
		opcaos = obterValor();
		
		while(opcaos > 2 || opcaos < 1) {
			System.out.println("Por favor informe um valor válido:");
			opcaos = obterValor();
		}
		
		if(opcaos == 1) {
				cliente.setTipoPessoa(TipoPessoa.FISICA);
		}
		
		if(opcaos == 2) {
				cliente.setTipoPessoa(TipoPessoa.JURIDICA);
		}
		
		System.out.println("Você iniciou o cadastro de " + cliente.getTipoPessoa().getTipo());
		System.out.println("3 - Informe seu CPF/CNPJ:");
		documento = leitor.next();
		cliente.setCodigo(documento);
		
		System.out.println("Parabéns, seu cadastro foi realizado com sucesso");
		System.out.println("Deseja fazer um novo cadastro?");
		System.out.println("1 - SIM");
		System.out.println("2 - NÃO e Voltar a opção anterior");
		System.out.println("3 - NÃO e Sair do programa");
		opcaos = obterValor();
		
		while(opcaos > 3 || opcaos < 1) {
			System.out.println("Por favor informe um valor válido:");
			opcaos = leitor.nextInt();
		}
		
		if(opcaos == 1) {
			cadastrar();
		}
		
		if(opcaos == 3) {
			encerrar();
		}
		
	}		
	
	public void encerrar() {
		System.out.println("Obrigado por utilizar nossos serviços!");
		System.out.println("Você faz a diferença!");
		System.exit(0);
	}
	

	public void imprimirClientes() {

	}
}

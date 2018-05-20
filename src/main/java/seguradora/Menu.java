package seguradora;
/**
 * 
 * @author douglas.monteiro & karoline.lyra
 * Classe responsável por conter as informações de menu
 * e informações de texto adicionais
 *
 */

public class Menu {
	
	public void menu() {
		
		System.out.println("1 - Cadastro de Cliente");
		System.out.println("2 - Cadastro de Contratos");
		System.out.println("3 - Lista de Clientes");
		System.out.println("4 - Lista de Contratos");
		System.out.println("5 - Cadastro de Sinistro");
		System.out.println("6 - Lista de Contratos sem Sinistro");
		System.out.println("7 - Ajuda");
		System.out.println("8 - Sair do Programa");
		
	}
	
	public void cabecalho() {
		System.out.println("-------------------------");
		System.out.println("        SEGURADORA       ");
		System.out.println("-------------------------");
	}
	
	public void ajuda() {
		System.out.println("1 - Cadastro de Cliente");
		System.out.println("Realiza cadastro de Clientes no nosso sistema");
		System.out.println("");
		System.out.println("2 - Cadastro de Contratos");
		System.out.println("Cadastra o contrato para um cliente já cadastrado no sistema");
		System.out.println("");
		System.out.println("3 - Lista de Clientes");
		System.out.println("Lista de nossos clientes");
		System.out.println("");
		System.out.println("4 - Lista de Contratos");
		System.out.println("Lista de Contratos que possuimos no momento");
		System.out.println("");
		System.out.println("5 - Cadastro de Sinistro");
		System.out.println("Cadastro de Sinistro, que nada mais é do que as ocorrências as quais");
		System.out.println("o cliente deseja que o imóvel esteja assegurado");
		System.out.println("");
		System.out.println("6 - Lista de Contratos sem Sinistro");
		System.out.println("Listagem de Contratos de clientes que ainda não possuem sinistro");
		System.out.println("");
		
	}

}

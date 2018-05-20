package seguradora;

/**
 * 
 * @author douglas.monteiro & karoline.lyra
 *Classe principal, responsável pela execução do programa
 *
 */

public class Principal {
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		ManipulaValores valores = new ManipulaValores();
		int opcao = 0;
		
		menu.cabecalho();
		while(true) {
			menu.menu();
			opcao = valores.obterValor();
			
			switch(opcao) {
			
			case 1://Cadastrar clientes no sistema
				valores.cadastrar();
				break;
				
			case 2://Cadastrar as informações do contrato
				break;
			
			case 3://Imprimir os clientes
				valores.imprimirClientes();
				break;
			
			
			case 7://Exibe informações de ajuda que explicam todas as opções
				menu.ajuda();
				break;
				
			case 8://Sai do prograna
				valores.encerrar();
				break;
			
			default:
				System.out.println("Opção inválida, por favor, tente novamente!");
				break;
			}
		}
	}
}
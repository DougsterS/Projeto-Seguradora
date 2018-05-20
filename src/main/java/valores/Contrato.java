package valores;
/**
 * 
 * @author douglas.monteiro & karoline.lyra
 * Classe responsável por armazenar as variáveis comuns entre os
 * contratos residencias e empresariais
 *
 */

public abstract class Contrato {
	/**
	 * Variáveis:
	 * -cliente    : variável responsável por receber as informações do Cliente
	 * -valorImóvel: responsável por fazer uso do valor do imóvel
	 */
	
	  private Cliente cliente;//informações do cliente
	  private Float valorImovel;//valor do imóvel
	  
	  public abstract Float obterValorSeguro(); 
	  
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		public Float getValorImovel() {
			return valorImovel;
		}
		public void setValorImovel(Float valorImovel) {
			this.valorImovel = valorImovel;
		}
		  
	}
package valores;

import enums.TipoPessoa;

/**
 * 
 * @author douglas.monteiro & karoline.lyra
 * Classe responsável por armazenar as informações e métodos 
 * referentes ao Cliente
 *
 */

public class Cliente {
	/**
	 * Nessa classe são atribuidas as variáveis:
	 * -codigo    : variável que recebe os documentos do cliente
	 * -nome      : recebe o nome do cliente
	 * -TipoPessoa: recebe a informação referente a tipo de pessoa que se trata o cliente(Física ou Jurídica)
	 */
	
	//Variáveis
	private String codigo;//Documento do Cliente: CPF/CNPJ
	private String nome;//Nome do CLiente
	private TipoPessoa tipoPessoa;//Pessoa Física ou Juridica
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}


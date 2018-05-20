package enums;
/**
 * 
 * @author douglas.monteiro & karoline.lyra
 * Classe responsável por Armazenar as informações do Ramo 
 * de EMpresa do contrato
 *
 */

public enum Ramo {
	
	COMERCIO(1, "Comércio"),
	INDUSTRIA(2, "Industrial"),
	AGRO(3, "Agropecuário");
	
	private int codigo;
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	private Ramo(int codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;		
	}

}
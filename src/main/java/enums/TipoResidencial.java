package enums;
/**
 * 
 * @author douglas.monteiro & karoline.lyra
 * Classe responsável por receber a informação
 * do tipo de casa em contratos residenciais
 *
 */

public enum TipoResidencial {
	
	APARTAMENTO(1, "Apartamento"),
	CASA(2, "Casa");
	
	private int codigo;
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	
	private TipoResidencial(int codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;		
	}
	
}
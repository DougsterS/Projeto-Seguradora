package enums;
/**
 * 
 * @author douglas.monteiro & karoline.lyra
 * Classe responsável por delimitar o tipo de Zona que está localizado
 * o imóvel do CLiente
 *
 */

public enum Zona {
	
	URBANA(1, "Urbana"),
	SUBURBANA(2, "Suburbana"),
	RURAL(3, "Rural");
	
	private int codigo;
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	private Zona(int codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;		
	}

}
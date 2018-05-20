package enums;
/**
 * 
 * @author douglas.monteiro & karoline.lyra
 * Classe responsável por delimitar o tipo de pessoa com a qual
 * a seguradora está tratando no momento
 *
 */

public enum TipoPessoa {
	/**
	 * Pessoa Físicas ou Jurídicas diferem no tratamento
	 * PORTANTO é necessário que haja essa separação
	 */
	FISICA (1,"Pessoa Física"),
	JURIDICA (2,"Pessoa Jurídica");
	
	private String tipo;
	private int codigo;
	
	
	public int getCodigo() {
		return codigo;
	}

	private TipoPessoa(int codigo, String tipo){
		this.tipo = tipo;
		this.codigo = codigo;
	}
	
	  public String getTipo() {
	        return tipo;
	   }
	
}

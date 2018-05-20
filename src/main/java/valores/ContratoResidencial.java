package valores;

import enums.TipoResidencial;
import enums.Zona;

/**
 * 
 * @author douglas.monteiro & karoline.lyra
 * Classe responsável por armazenar as informações exclusivas de Contratos Residenciais
 *
 */

public class ContratoResidencial extends Contrato {
	
	private String endereco;//Endereço da residência
	private int numResidencia;//Número de residência
	private Zona zona;//Zona da localidade
	private TipoResidencial residencia;//Apartamento ou Casa
	
	@Override
	public Float obterValorSeguro() {
		Float valorSeguro = obterValorPercentualImovel();
		valorSeguro += ObterValorZona();
		valorSeguro += ObterResidencial();
		return valorSeguro;
	}
	
	public float obterValorPercentualImovel() {
		float valor = getValorImovel() * 0.02f;
		return valor;				
	}
	
	public float ObterValorZona() {
		if(getZona().equals(Zona.URBANA)) 
			return getValorImovel() * 0.01f;
		if(getZona().equals(Zona.SUBURBANA))
			return getValorImovel() * 0.005f;	
		return 0.0f;
	}
	
	public float ObterResidencial() {
		if(getResidencial().equals(TipoResidencial.CASA))
			return getValorImovel() * 0.005f;
		return 0.0f;		
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumResidencia() {
		return numResidencia;
	}
	public void setNumResidencia(int numResidencia) {
		this.numResidencia = numResidencia;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public TipoResidencial getResidencial() {
		return residencia;
	}
	public void setResidencia(TipoResidencial residencia) {
		this.residencia = residencia;
	}

}

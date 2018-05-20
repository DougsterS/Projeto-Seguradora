package valores;

import enums.Ramo;

/**
 * 
 * @author douglas.monteiro & karoline.lyra
 * Classe responsável por armazenar as informações exclusivas de Contratos Empresariais
 *
 */

public class ContratoEmpresarial extends Contrato{

	private int funcionarios;//Número de funcionários da empresa
	private int visitas;//Visitas diárias que a empresa recebe
	private Ramo ramo;//Ramo da Indústria
	
	@Override
	public Float obterValorSeguro() {
		Float valorSeguro = obterValorPercentualImovel();
		valorSeguro += obterValorTotalFuncionarios();				
		valorSeguro += obterValorVisitas();
		valorSeguro += obterValorRamo();

		return valorSeguro;
	}
	
	
	public float obterValorPercentualImovel() {
		float valor = getValorImovel() * 0.04f;
		return valor;				
	}
	
	public float obterValorTotalFuncionarios() {
		int quantidadeFuncionario = getFuncionarios();
		float valorCalculado = (quantidadeFuncionario/10) * 0.002f;
		return valorCalculado;
	}
	
	public float obterValorVisitas() {
		int visitas = getVisitas();
		float valorCalculado = (visitas/200) * 0.003f;
		return valorCalculado;
	}

	public float obterValorRamo() {
		if(getRamo().equals(Ramo.INDUSTRIA)) 
			return getValorImovel() * 0.01f;
		
		if(getRamo().equals(Ramo.COMERCIO))
			return getValorImovel() * 0.005f;		
		return 0.0f;
	}
	
	
	public int getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public int getVisitas() {
		return visitas;
	}
	
	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}
	
	public Ramo getRamo() {
		return ramo;
	}
	
	public void setRamo(Ramo ramo) {
		this.ramo = ramo;
	}

}

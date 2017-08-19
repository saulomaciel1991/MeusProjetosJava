/**
 * @author Saulo
 *
 */
public class FuncionarioHorario extends Funcionario {
	private Double valor_hora;
	private Double qtd_horas;

	public Double getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(Double valor_hora) {
		this.valor_hora = valor_hora;
	}

	public Double getQtd_horas() {
		return qtd_horas;
	}

	public void setQtd_horas(Double qtd_horas) {
		this.qtd_horas = qtd_horas;
	}

	@Override
	public Double obterSalario() {
		return this.getQtd_horas() * this.getValor_hora();
	}
	
	@Override
	public String toString() {
		return this.getCpf() + " - " + this.getNome() + ", " + this.getIdade() + " : " + this.obterSalario() + " (FH)";
	}

	public FuncionarioHorario() {
		super();
	}

	public FuncionarioHorario(String cpf, String nome, Short idade, Double valor_hora, Double qtd_horas) {
		super(cpf, nome, idade);
		this.setValor_hora(valor_hora);
		this.setQtd_horas(qtd_horas);
	}
	
	
}

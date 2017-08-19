/**
 * 
 * @author Saulo
 *
 */
public class FuncionarioChefe extends Funcionario {
	private Double valor_inicial;
	private Double gratificacao;
	private Funcionario funcionarioAssessor;

	public Double getValor_inicial() {
		return valor_inicial;
	}

	public Funcionario getFuncionarioAssessor() {
		return funcionarioAssessor;
	}

	public void setFuncionarioAssessor(Funcionario funcionarioAssessor) throws NaoFuncionarioException {
		if (!(funcionarioAssessor instanceof FuncionarioHorario) && !(funcionarioAssessor instanceof FuncionarioChefe)) {
			this.funcionarioAssessor = funcionarioAssessor;
		} else {
			throw new NaoFuncionarioException();
		}

	}

	public void setValor_inicial(Double valor_inicial) {
		this.valor_inicial = valor_inicial;
	}

	public Double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(Double gratificacao) {
		this.gratificacao = gratificacao;
	}

	@Override
	public Double obterSalario() {
		return this.getValor_inicial() + this.gratificacao;
	}

	@Override
	public String toString() {
		return this.getCpf() + " - " + this.getNome() + ", " + this.getIdade() + " : " + this.obterSalario() + " (FC) "
				+ "Assessor: " + this.funcionarioAssessor.getNome();
	}

	public FuncionarioChefe() {
		super();
	}

	public FuncionarioChefe(String cpf, String nome, Short idade, Double gratificacao, Double valor_inicial,
			Funcionario funcionarioAssessor) {
		super(cpf, nome, idade);

		this.setGratificacao(gratificacao);
		this.setValor_inicial(valor_inicial);
		try {
			this.setFuncionarioAssessor(funcionarioAssessor);
		} catch (NaoFuncionarioException e) {
			e.getMessage();
		}

	}

}

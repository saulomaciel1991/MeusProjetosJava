/**
 * 
 * @author Saulo
 *
 */
public class Funcionario implements iFuncionario {
	private String cpf;
	private String nome;
	private Short idade;
	private Double salario;

	public Funcionario(String cpf, String nome, Short idade, Double salario) {
		super();
		this.setCpf(cpf);
		this.setNome(nome);
		this.setIdade(idade);
		this.setSalario(salario);
	}
	
	public Funcionario(String cpf, String nome, Short idade) {
		super();
		this.setCpf(cpf);
		this.setNome(nome);
		this.setIdade(idade);		
	}

	public Funcionario() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Short getIdade() {
		return idade;
	}

	public void setIdade(Short idade) {
		this.idade = idade;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public Double obterSalario() {
		return salario;
	}

	@Override
	public Boolean equals(Funcionario f) {
		Boolean retorno = false;
		if (this.getCpf() == f.getCpf()) {
			retorno = true;
		}
		return retorno;
	}

	@Override
	public String toString() {
		return this.getCpf() + " - " + this.getNome() + ", " + this.getIdade() + " : " + this.obterSalario() + " (F)";
	}

}

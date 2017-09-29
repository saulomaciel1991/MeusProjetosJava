package basicas;

public class DadosFutebol {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Tecnico t1 = new Tecnico(1, "Paulo Autuori", "10/03/1958", 102000.0);
		Tecnico t2 = new Tecnico(2, "Mano Menezes", "21/04/1957", 90000.0);
		Tecnico t3 = new Tecnico(1, "Marcelo Oliveira", "10/03/1958", 82500.0);

		Time tm1 = new Time(1, "São Paulo", "SP", 15, t1);
		Time tm2 = new Time(2, "Cruzeiro", "MG", 32, t3);
		Time tm3 = new Time(3, "Flamengo", "RJ", 30, t3);

		Jogador j1 = new Jogador(1, "Rogério Ceni", "28/10/1979", 01, false, true, 2, 1, 88000.0, tm1);
		Jogador j2 = new Jogador(2, "Alex Silva", "04/01/1983", 02, false, true, 2, 1, 45000.0, tm1);
		// Jogador x = new Jogador(id, nome, dataNascimento, numeroCamisa,
		// cartaoAmarelo, estaEmCampo, quantidadeCartoesAmarelos,
		// quantidadeCartoesVermelhos, salario, time)

		Jogador j3 = new Jogador(3, "Fabão", "22/11/1982", 03, false, true, 3, 0, 52500.0, tm2);
	}

}

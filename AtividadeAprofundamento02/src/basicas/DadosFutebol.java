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
		Jogador j3 = new Jogador(3, "Fabão", "22/11/1982", 03, false, true, 3, 0, 52500.0, tm2);
		Jogador j4 = new Jogador(4, "Edcarlos", "16/05/1984", 04, false, false, 1, 0, 70000.0, tm2);
		Jogador j5 = new Jogador(5, "Souza", "27/09/1980", 15, true, true, 1, 1, 65000.0, tm1);
		Jogador j6 = new Jogador(5, "Ilsinho", "25/11/1984", 06, false, false, 2, 0, 43860.90, tm1);

		Juiz jz1 = new Juiz(1, "Armando Marques", "06/02/1930", 24000.0);
		Juiz jz2 = new Juiz(1, "Paulo Cesar de Oliveira", "16/12/1973", 35000.0);
		
		Jogo jg1 = new Jogo(1, tm1, tm2, jz2, "2X1", "13/07/2013");
		Jogo jg2 = new Jogo(2, tm2, tm1, jz1, "0X0", "10/10/2013");
		Jogo jg3 = new Jogo(3, tm3, tm2, jz2, "1X1", "14/08/2013");
		Jogo jg4 = new Jogo(4, tm1, tm3, jz1, "0X0", "19/09/2013");

	}

}

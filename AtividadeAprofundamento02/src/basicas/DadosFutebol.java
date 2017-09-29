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
		
	}

}

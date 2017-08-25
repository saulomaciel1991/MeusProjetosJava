package teste;

import java.util.ArrayList;

import basicas.*;
import util.EletronicoDesligadoException;

public class TesteEletronicos {

	public static void main(String[] args) {

		// Declaração das variaveis
		AparelhoDeSom xyz = new AparelhoDeSom();
		CD cd = new CD();
		//CDPlayer cdplayer = new CDPlayer();

		Musica m1 = new Musica("Todo Carnaval tem seu fim", "Los Hermanos", "Marcelo Camelo", 252);
		Musica m2 = new Musica("A flor", "Los Hermanos", "Rodrigo Amarante", 210);
		Musica m3 = new Musica("Retrato Pra Iaiá", "Los Hermanos", "Marcelo Camelo", 282);
		Musica m4 = new Musica("Assim será", "Los Hermanos", "Marcelo Camelo", 194);
		Musica m5 = new Musica("Casa pré-fabricada", "Los Hermanos", "Marcelo Camelo", 245);

		ArrayList<Musica> musicas = new ArrayList<>();

		// setando os valores
		musicas.add(m1);
		musicas.add(m2);
		musicas.add(m3);
		musicas.add(m4);
		musicas.add(m5);
		cd.setNomeAlbum("Bloco do eu sozinho");
		cd.setAnoLancamento(2001);
		cd.setMusicas(musicas);
		cd.setNomeArtista("Los Hermanos");
		xyz.setMarca("Sony");
		xyz.setPotencia(60.0);

		/*
		 * cdplayer.colocarCD(cd); cdplayer.play(); cdplayer.avancarMusica();
		 * cdplayer.avancarMusica(); cdplayer.recuarMusica();
		 * cdplayer.recuarMusica(); cdplayer.recuarMusica();
		 */
		xyz.ligar();
		xyz.getPlayer().colocarCD(cd);
		
		try {
			xyz.alterarFuncao(Funcao.CD);

			xyz.getPlayer().avancarMusica();
		} catch (EletronicoDesligadoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}

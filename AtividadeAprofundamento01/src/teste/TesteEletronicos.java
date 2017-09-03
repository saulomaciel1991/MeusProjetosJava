package teste;

import java.util.ArrayList;

import basicas.*;
import util.EletronicoDesligadoException;

public class TesteEletronicos {

	public static void main(String[] args) {

		ArrayList<Musica> musicas = new ArrayList<>();
		ArrayList<Musica> musicas2 = new ArrayList<>();

		AparelhoDeSom xyz = new AparelhoDeSom();
		CDPlayer cdplayer = new CDPlayer();
		USBPlayer usbplayer = new USBPlayer();
		Computador computador = new Computador();
		Televisor tv = new Televisor();

		CD cd = new CD();
		Musica m1 = new Musica("Todo Carnaval tem seu fim", "Los Hermanos", "Marcelo Camelo", 252);
		Musica m2 = new Musica("A flor", "Los Hermanos", "Rodrigo Amarante", 210);
		Musica m3 = new Musica("Retrato Pra Iaiá", "Los Hermanos", "Marcelo Camelo", 282);
		Musica m4 = new Musica("Assim será", "Los Hermanos", "Marcelo Camelo", 194);
		Musica m5 = new Musica("Casa pré-fabricada", "Los Hermanos", "Marcelo Camelo", 245);
		Musica m6 = new Musica("Pais e Filhos", "Legiao Urbana", "Renato Russo", 330);
		Musica m7 = new Musica("All you need is love", "The Beatles", "John Lennon", 212);
		Musica m8 = new Musica("A flor", "", "Rodrigo Amarante", 210);
		Musica m9 = new Musica("Construção", "", "Chico Buarque", 280);

		musicas.add(m1);
		musicas.add(m2);
		musicas.add(m3);
		musicas.add(m4);
		musicas.add(m5);
		musicas2.add(m6);
		musicas2.add(m7);
		musicas2.add(m8);
		musicas2.add(m9);

		cd.setNomeAlbum("Bloco do eu sozinho");
		cd.setAnoLancamento(2001);
		cd.setMusicas(musicas);
		cd.setNomeArtista("Los Hermanos");

		xyz.setMarca("Sony");
		xyz.setPotencia(60.0);
		xyz.ligar();

		try {
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.alterarFuncao(Funcao.CD);
			cdplayer.colocarCD(cd);
			cdplayer.play();
			cdplayer.avancarMusica();
			cdplayer.avancarMusica();
			cdplayer.stop();
			cdplayer.tirarCD();
			xyz.alterarFuncao(Funcao.RADIO);
			xyz.diminuirVolume();
			xyz.diminuirVolume();
			xyz.alterarFuncao(Funcao.USB);
			usbplayer.setMusicas(musicas2);
			usbplayer.play();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			xyz.aumentarVolume();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			usbplayer.avancarMusica();
			xyz.desligar();

		} catch (EletronicoDesligadoException e) {
			e.getMessage();
		}

		ControleRemoto cr = new ControleRemoto();

		cr.ligar(computador);
		cr.ligar(tv);

	}

}

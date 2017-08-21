package formageometrica;

import java.util.ArrayList;

/**
 *
 * @author Saulo Maciel
 */
public class ColecaoFormas {

	ArrayList<FormaGeometrica> formas;
	ArrayList<Retangulo> retangulos;

	public ColecaoFormas() {
		formas = new ArrayList<>();
		retangulos = new ArrayList<>();
	}

	public void adicionarForma(FormaGeometrica forma) throws AreaMenorQueOMinimoException {
		if (forma.calculaArea() <= 4) {
			throw new AreaMenorQueOMinimoException();
		} else {
			formas.add(forma);
		}
	}

	public Integer retornarAreaTotal() {
		Integer soma = 0;

		for (FormaGeometrica forma : formas) {
			soma += forma.calculaArea();
		}
		return soma;
	}

	public Integer perimetroTotal() {
		Integer soma = 0;
		for (FormaGeometrica forma : formas) {
			soma += forma.calculaPerimetro();
		}
		return soma;
	}

	public Integer obterQuantidadeQuadrados() {
		Integer qtdQuadrados = 0;
		Retangulo retangulo = new Retangulo();
		for (FormaGeometrica forma : formas) {
			if (forma instanceof Retangulo) {
				retangulo = (Retangulo) forma;
				if (retangulo.ehQuadrado()) {
					qtdQuadrados++;
				}
			}
		}

		return qtdQuadrados;
	}

	public ArrayList<Retangulo> obterColecaoRetangulos() {		
		retangulos = null;
		Retangulo r = new Retangulo();
		for (FormaGeometrica formaGeometrica : formas) {
			if ((formaGeometrica instanceof Retangulo) && !(formaGeometrica instanceof Quadrado)) {
				r = (Retangulo) formaGeometrica;
				retangulos.add(r);
			}
		}

		return retangulos;
	}
}

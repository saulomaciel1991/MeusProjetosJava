package formageometrica;

/**
 *
 * @author Saulo Maciel
 */
public class TesteFormaGeometrica {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado(8);
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo(4, 9);
		Retangulo r3 = new Retangulo(3);
		ColecaoFormas formasPSC = new ColecaoFormas();		

		try {
			formasPSC.adicionarForma(q1);
			formasPSC.adicionarForma(q2);
			formasPSC.adicionarForma(r1);
			formasPSC.adicionarForma(r2);
			formasPSC.adicionarForma(r3);
		} catch (AreaMenorQueOMinimoException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(formasPSC.retornarAreaTotal());
		System.out.println(formasPSC.perimetroTotal());
		System.out.println(formasPSC.obterQuantidadeQuadrados());		

		
		for (FormaGeometrica r : formasPSC.obterColecaoRetangulos()) {

			/*if (fg instanceof Retangulo) {
				System.out.println(((Retangulo) fg).getAltura() + " " + ((Retangulo) fg).getComprimento());
			}*/
			System.out.println(((Retangulo)r).getAltura()+" "+((Retangulo)r).getComprimento());

		}

	}
}

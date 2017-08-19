package formageometrica;

/**
 *
 * @author aluno
 */
public class Quadrado extends Retangulo {

    public Quadrado() {
        super();
    }

    public Quadrado(Integer valor) {
        super(valor);
    }

    public void aumentarQuadrado() {
        this.setAltura(this.getAltura() + 1);
        this.setComprimento(this.getComprimento() + 1);
    }
    
}

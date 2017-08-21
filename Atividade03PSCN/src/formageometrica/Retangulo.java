package formageometrica;

/**
 *
 * @author Saulo Maciel
 */
public class Retangulo extends FormaGeometrica {

    private Integer comprimento;
    private Integer altura;

    @Override
    public Integer calculaArea() {
        return this.altura * this.comprimento;
    }

    @Override
    public Integer calculaPerimetro() {
        return (this.altura * 2) + (this.comprimento * 2);
    }

    public Boolean ehQuadrado() {
        Boolean retorno = false;
        if (this.comprimento == this.altura) {
            retorno = true;
        }
        return retorno;
    }

    @Override
    public boolean equals(Object obj) {
        Boolean retorno = false;
        Retangulo r = new Retangulo();        
        r = (Retangulo)obj;
        
        if (obj instanceof Retangulo) {
            if ((this.altura == r.altura) && (this.comprimento == r.comprimento)) {
                retorno = true;
            }
        }

        return retorno;
    }
    
    @Override
    public String toString(){
    	return "Altura: "+this.getAltura()+" - "+"Comprimento: "+this.getComprimento();
    }	
  
    public Retangulo() {
        super();
        this.altura = 5;
        this.comprimento = 5;
    }

    public Retangulo(Integer valor) {
        this.altura = valor;
        this.comprimento = valor;
    }

    public Retangulo(Integer altura, Integer comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }

    /**
     * @return the comprimento
     */
    public Integer getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(Integer comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the altura
     */
    public Integer getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Integer altura) {
        this.altura = altura;
    }

}

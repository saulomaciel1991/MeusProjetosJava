package formageometrica;

/**
 *
 * @author aluno
 */
public class AreaMenorQueOMinimoException extends Exception{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public AreaMenorQueOMinimoException(){
      
   } 
   
   @Override
   public String getMessage(){
       return "Área da forma geométrica abaixo do limite infeiror!";
   }
   
}

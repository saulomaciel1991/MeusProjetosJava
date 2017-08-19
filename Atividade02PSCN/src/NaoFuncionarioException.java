
public class NaoFuncionarioException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage(){
		return "O objeto informado não é do tipo funcionário!";
	}
}

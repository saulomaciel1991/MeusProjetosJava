package util;

public class EletronicoDesligadoException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "O aparelho precisa está ligado para usar esta função!";
	}

}

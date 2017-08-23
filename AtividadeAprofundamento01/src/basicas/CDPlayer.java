package basicas;

public class CDPlayer extends Player<Object>{
	private CD CDCarregado;
	
	public void colocarCD(CD CDCarregado){
		this.setCDCarregado(CDCarregado);
		System.out.println("Foi colocado o CD de "+CDCarregado.getNomeArtista());
	}
	
	public void tirarCD(){
		System.out.println("Foi tirado o CD de "+this.CDCarregado.getNomeArtista());
		this.setCDCarregado(null);
	}

	public CD getCDCarregado() {
		return CDCarregado;
	}

	public void setCDCarregado(CD cDCarregado) {
		CDCarregado = cDCarregado;
	}
	
	
}

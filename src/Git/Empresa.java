package Git;

public class Empresa {

	private Usuario usuario;
    private String region;
    
    public Empresa (Usuario usuario, String region) {
    	this.usuario = usuario;
    	this.region = region;
    }

	public Usuario getUsuario() {
		return usuario;
	}
	public String getRegion() {
		return region;
	}

	@Override
	public String toString() {
		return "Empresa [region=" + region + "]";
	}


    
    
    
}

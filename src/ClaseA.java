
public class ClaseA {
	
	private String nombre = "";
	private String apellidos = "";
	
	public ClaseA(){
		this.setNombre("Jose");
		this.apellidos = "Martinez";
	}

	public static void main(String[] args) {
		
		ClaseA ca = new ClaseA();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

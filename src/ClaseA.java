
public class ClaseA {
	
	private String nombre = "";
	private String apellidos = "";
	
	public ClaseA(){
		this.setNombre("Jose");
		this.setApellidos("Martinez");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}	

	public static void main(String[] args) {
		
		ClaseA ca = new ClaseA();

	}

}

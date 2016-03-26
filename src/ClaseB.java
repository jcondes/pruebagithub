import java.util.ArrayList;


public class ClaseB {
	
	private String empresa = "";
	private String domicilio = "";
	private ArrayList<ClaseA> empleados = null;
	
	public ClaseB(){
		this.empresa = "Bankia";
		this.empleados = new ArrayList<ClaseA>();
	}

	public static void main(String[] args) {

		ClaseB cb = new ClaseB();

	}

}

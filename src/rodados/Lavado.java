package rodados;

import java.util.GregorianCalendar;

public class Lavado extends Servicio{

	private double precioEncerado;
	private boolean encerado;
	
	public Lavado(GregorianCalendar fechaHora, String dominio, double precioBase, double precioEncerado,
			boolean encerado) throws Exception {
		super(fechaHora, dominio, precioBase);
		this.precioEncerado = precioEncerado;
		this.encerado = encerado;
	}

	public double getPrecioEncerado() {
		return precioEncerado;
	}

	public void setPrecioEncerado(double precioEncerado) {
		this.precioEncerado = precioEncerado;
	}

	public boolean isEncerado() {
		return encerado;
	}

	public void setEncerado(boolean encerado) {
		this.encerado = encerado;
	}

	public String traerServicioBrindado () {
		return "Servicio de Lavado";
	}
	
	@Override
	public String toString() {
		return "Lavado [fechaHora=" + fechaHora + ", dominio=" + dominio + ", precioBase=" + precioBase + "precioEncerado=" + precioEncerado + ", encerado=" + encerado + "]";
	}
	
}

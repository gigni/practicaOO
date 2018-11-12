package rodados;

import java.util.GregorianCalendar;

public abstract class Servicio {

	protected GregorianCalendar fechaHora;
	protected String dominio;
	protected double precioBase;
	
	public Servicio(GregorianCalendar fechaHora, String dominio, double precioBase) throws Exception{
		if (precioBase<0) throw new Exception ("El precio no puede ser negativo");
		this.fechaHora = fechaHora;
		this.dominio = dominio;
		this.precioBase = precioBase;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public abstract String traerServicioBrindado ();
	
	@Override
	public abstract String toString();
	
}

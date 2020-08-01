package co.com.facturas.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Datos {
	@XmlElement(name = "Dato", required = true)
	private float Datos;

	public Datos() {
		super();
	}

	public float getDatos() {
		return Datos;
	}

	public void setDatos(float datos) {
		this.Datos = datos;
	}

}

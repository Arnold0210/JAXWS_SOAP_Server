package co.com.facturas.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Datos {
	@XmlElement(name = "numero", required = true)
	private float numero;

	public Datos() {
		super();
	}

	public float getDatos() {
		return numero;
	}

	public void setDatos(float numero) {
		this.numero = numero;
	}

}

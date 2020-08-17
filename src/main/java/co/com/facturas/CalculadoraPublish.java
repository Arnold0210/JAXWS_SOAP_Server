package co.com.facturas;

import javax.xml.ws.Endpoint;

import co.com.facturas.util.TipoLog;
import co.com.facturas.util.Util;
import co.com.facturas.soap.CalculadoraImpl;

public class CalculadoraPublish {

	public static void main(String[] args) {

		try {
			Endpoint.publish("http://localhost:8081/CalculadoraSOAP", new CalculadoraImpl());
		} catch (IllegalArgumentException e) {
			Util.registarInfo(CalculadoraPublish.class, TipoLog.ERROR, e);
		}
	}

}

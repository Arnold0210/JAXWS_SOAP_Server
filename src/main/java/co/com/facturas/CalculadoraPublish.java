package co.com.facturas;

import javax.xml.ws.Endpoint;

import co.com.facturas.soap.CalculadoraImpl;

public class CalculadoraPublish {

	public static void main(String[] args) {
//		
		try {
			Endpoint.publish("http://localhost:8081/CalculadoraSOAP", new CalculadoraImpl());
		} catch (IllegalArgumentException e) {
			System.out.println("No web Services today:(" + e);
		}
	}

}

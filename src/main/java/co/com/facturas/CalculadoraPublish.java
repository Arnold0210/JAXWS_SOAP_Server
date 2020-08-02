package co.com.facturas;

import javax.xml.ws.Endpoint;

import co.com.facturas.soap.CalculadoraImpl;

public class CalculadoraPublish {
	
	public static void main(String[] args) {
//		
		Endpoint.publish("http://localhost:8081/CalculadoraSOAP", new CalculadoraImpl());

	}

}

package co.com.facturas.soap;

import java.util.Vector;

import javax.jws.WebService;
//import javax.xml.ws.WebServiceProvider;

//import javax.jws.WebService;

import co.com.facturas.model.Datos;

@WebService(endpointInterface = "co.com.facturas.soap.CalculadoraInterface", name = "CalculadoraWS", serviceName = "CalculadoraSOAP", targetNamespace = "http://calculadora.facturas.com.co")
public class CalculadoraImpl implements CalculadoraInterface {

	private static Vector<Datos> arrayDatos = new Vector<>();

	public static Vector<Datos> getArrayDatos() {
		return arrayDatos;
	}

	public static void setArrayDatos(Vector<Datos> arrayDatos) {
		CalculadoraImpl.arrayDatos = arrayDatos;
	}

	@Override
	public String leerDatos(Datos dato) {
		arrayDatos.add(dato);
		return "Número " + dato.getDatos() + " almacenado correctamente";
	}

	@Override
	public String addOperation() {
		float result = 0;
		if (!arrayDatos.isEmpty()) {
			for (Datos d : arrayDatos) {
				result += d.getDatos();

			}
		}

		return String.valueOf(result);
	}

	@Override
	public String substractOperation() {
		float result = 0;
		if (!arrayDatos.isEmpty()) {
			for (Datos d : arrayDatos) {
				result -= d.getDatos();

			}

		}
		return String.valueOf(result);
	}

	@Override
	public String multiplierOperation() {
		float result = 1;
		if (!arrayDatos.isEmpty()) {
			for (Datos d : arrayDatos) {
				result *= d.getDatos();

			}

		}
		return String.valueOf(result);
	}

	@Override
	public String divideOperation() {
		float result = 1;
		if (!arrayDatos.isEmpty()) {
			for (Datos d : arrayDatos) {
				result /= d.getDatos();

			}
		}
		return String.valueOf(result);
	}

	@Override
	public Vector<Datos> mostrarDatos() {
		return arrayDatos;
	}

}

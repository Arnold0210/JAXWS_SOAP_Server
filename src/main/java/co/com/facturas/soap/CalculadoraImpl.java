package co.com.facturas.soap;

import java.util.HashSet;
import java.util.Set;

import javax.jws.WebService;

import co.com.facturas.model.Datos;

@WebService(endpointInterface = "co.com.facturas.soap.CalculadoraInterface", name = "CalculadoraWS", serviceName = "CalculadoraSOAP", targetNamespace = "http://facturas.com.co")
public class CalculadoraImpl implements CalculadoraInterface {

	private static Set<Datos> arrayDatos = new HashSet<>();

	public static Set<Datos> getArrayDatos() {
		return arrayDatos;
	}

	public static void setArrayDatos(Set<Datos> arrayDatos) {
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
	public Set<Datos> mostrarDatos() {
		return arrayDatos;
	}

}

package co.com.facturas.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import co.com.facturas.model.Datos;

@WebService(endpointInterface = "co.com.facturas.soap.CalculadoraInterface", name = "CalculadoraWS", serviceName = "CalculadoraSOAP", targetNamespace = "http://calculadora.facturas.com.co")
public class CalculadoraImpl implements CalculadoraInterface {

	private static ArrayList<Datos> arrayDatos = new ArrayList<>();

	public static List<Datos> getArrayDatos() {
		return arrayDatos;
	}

	public static void setArrayDatos(List<Datos> arrayDatos) {
		CalculadoraImpl.arrayDatos = (ArrayList<Datos>) arrayDatos;
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
	public ArrayList<Datos> mostrarDatos() {
		return arrayDatos;
	}

}

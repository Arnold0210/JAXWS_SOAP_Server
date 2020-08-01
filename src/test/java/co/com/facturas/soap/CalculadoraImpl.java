package co.com.facturas.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import co.com.facturas.model.Datos;

@WebService(name = "CalculadoraWebService", targetNamespace = "http://calculadora.facturas.com.co")
public class CalculadoraImpl implements CalculadoraInterface {

	private static List<Datos> arrayDatos = new ArrayList<Datos>();

	public static List<Datos> getArrayDatos() {
		return arrayDatos;
	}

	public static void setArrayDatos(List<Datos> arrayDatos) {
		CalculadoraImpl.arrayDatos = arrayDatos;
	}

	@Override
	@WebMethod(operationName = "Leer_Dato")
	public String leerDatos(@WebParam(name = "DatoIn") @XmlElement(required = true) Datos dato) {
		arrayDatos.add(dato);
		return "Número " + dato.getDatos() + " almacenado correctamente";
	}

	@Override
	@WebMethod(operationName = "Suma")
	public String addOperation() {
		float result = 0;
		if (arrayDatos.size() != 0) {
			for (Datos d : arrayDatos) {
				result += d.getDatos();
				System.out.println(result);

			}
		}

		return String.valueOf(result);
	}

	@Override
	@WebMethod(operationName = "Restar")
	public String substractOperation() {
		float result = 0;
		if (arrayDatos.size() != 0) {
			for (Datos d : arrayDatos) {
				result -= d.getDatos();
				System.out.println(result);
			}

		}
		return String.valueOf(result);
	}

	@Override
	@WebMethod(operationName = "Multiplicar")
	public String multiplierOperation() {
		float result = 1;
		if (arrayDatos.size() != 0) {
			for (Datos d : arrayDatos) {
				result *= d.getDatos();
				System.out.println(result);
			}

		}
		return String.valueOf(result);
	}

	@Override
	@WebMethod(operationName = "Dividir")
	public String divideOperation() {
		float result = 1;
		if (arrayDatos.size() != 0) {
			for (Datos d : arrayDatos) {
				result /= d.getDatos();
				System.out.println(result);
			}
		}
		return String.valueOf(result);
	}

	@Override
	@WebMethod(operationName = "Listar Datos")
	public List<Datos> mostrarDatos() {
		return arrayDatos;
	}

}

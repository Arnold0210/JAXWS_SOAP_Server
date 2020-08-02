package co.com.facturas.soap;

import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import co.com.facturas.model.Datos;

@WebService
public interface CalculadoraInterface {

	@WebMethod(operationName = "Leer_Dato")
	@WebResult(name = "Estado")
	public String leerDatos(@WebParam(name = "DatoIn") @XmlElement(required = true) Datos dato);

	@WebMethod(operationName = "Suma")
	@WebResult(name = "ResultadoSuma")
	public String addOperation();

	@WebMethod(operationName = "Resta")
	@WebResult(name = "ResultadoResta")
	public String substractOperation();

	@WebMethod(operationName = "Multiplicar")
	@WebResult(name = "ResultadoMultiplicar")
	public String multiplierOperation();

	@WebMethod(operationName = "Dividir")
	@WebResult(name = "ResultadoDividir")
	public String divideOperation();

	@WebMethod(operationName = "ListarDatos")
	@WebResult(name = "Listado de datos")
	public Set<Datos> mostrarDatos();

}

package co.com.facturas.soap;

import java.util.Vector;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.BindingType;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.sun.xml.ws.developer.SchemaValidation;

import co.com.facturas.model.Datos;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.ENCODED, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
@SchemaValidation
public interface CalculadoraInterface {

	@WebMethod(operationName = "Leer_Dato")
	@WebResult(name = "Estado", targetNamespace = "http://calculadora.facturas.com.co")
	@RequestWrapper(localName = "Leer_Dato", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.LeerDatos")
	@ResponseWrapper(localName = "Leer_DatoResponse", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.LeerDatosResponse")
	public String leerDatos(@WebParam(name = "DatoIn") @XmlElement(required = true) Datos dato);

	@WebMethod(operationName = "Suma")
	@WebResult(name = "ResultadoSuma", targetNamespace = "http://calculadora.facturas.com.co")
	@RequestWrapper(localName = "calcOperacionSuma", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.AddOperation")
	@ResponseWrapper(localName = "SumaResponse", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.AddOperationResponse")
	public String addOperation();

	@WebMethod(operationName = "Resta")
	@WebResult(name = "ResultadoResta", targetNamespace = "http://calculadora.facturas.com.co")
	@RequestWrapper(localName = "calcOperacionRestar", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.SubstractOperation")
	@ResponseWrapper(localName = "RestaResponse", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.SubstractOperationResponse")
	public String substractOperation();

	@WebMethod(operationName = "Multiplicar")
	@WebResult(name = "ResultadoMultiplicar", targetNamespace = "http://calculadora.facturas.com.co")
	@RequestWrapper(localName = "calcOperacionMultiplicar", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.MultiplierOperation")
	@ResponseWrapper(localName = "MultiplicarResponse", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.MultiplierOperationResponse")
	public String multiplierOperation();

	@WebMethod(operationName = "Dividir")
	@WebResult(name = "ResultadoDividir", targetNamespace = "http://calculadora.facturas.com.co")
	@RequestWrapper(localName = "calcOperacionDividir", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.DivideOperation")
	@ResponseWrapper(localName = "DividirResponse", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.DivideOperationResponse")
	public String divideOperation();

	@WebMethod(operationName = "ListarDatos")
	@WebResult(name = "Listado_de_datos", targetNamespace = "http://calculadora.facturas.com.co")
	@RequestWrapper(localName = "calcOperacionMostrarDatos", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.MostrarDatos")
	@ResponseWrapper(localName = "ListarDatosResponse", targetNamespace = "http://calculadora.facturas.com.co", className = "co.com.facturas.soap.jaxws.MostrarDatosResponse")
	public Vector<Datos> mostrarDatos();

}

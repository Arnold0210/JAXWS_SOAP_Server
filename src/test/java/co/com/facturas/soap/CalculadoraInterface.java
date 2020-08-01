package co.com.facturas.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import co.com.facturas.model.Datos;

@WebService
public interface CalculadoraInterface {
	@WebMethod
	public String leerDatos(Datos dato);

	@WebMethod
	public String addOperation();

	@WebMethod
	public String substractOperation();

	@WebMethod
	public String multiplierOperation();

	@WebMethod
	public String divideOperation();

	@WebMethod
	public List<Datos> mostrarDatos();

}

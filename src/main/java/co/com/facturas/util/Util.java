package co.com.facturas.util;

import org.apache.log4j.Logger;
//import org.apache.log4j.xml.DOMConfigurator;

public class Util {
	private static Logger log = Logger.getLogger(Util.class);

	@SuppressWarnings("rawtypes")
	public static void registarInfo(Class clase, TipoLog tipo, Object message) {
		// DOMConfigurator.configure("src/main/resources/log4j.properties");
		switch (tipo) {
		case DEBUG:
			log.debug(message);
			break;
		case ERROR:
			log.error(message);
			break;
		case FATAL:
			log.fatal(message);
			break;
		case INFO:
			log.info(message);
			break;
		case WARNING:
			log.warn(message);
			break;

		}
	}

}

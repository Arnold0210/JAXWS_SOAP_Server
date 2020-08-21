package co.com.facturas.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

public class Util {

	private Util() {

		throw new IllegalStateException("Utiility Class");
	}

	private static Logger log = LogManager.getLogger(Util.class);

	public static void registarInfo(Class<?> clazz, TipoLog tipo, Object message) {
		log = LogManager.getLogger(clazz);
		switch (tipo) {
		case DEBUG:
			log.debug(message.toString());
			break;
		case ERROR:
			log.error(message.toString());
			break;
		case FATAL:
			log.fatal(message.toString());
			break;
		case INFO:
			log.info(message.toString());
			break;
		case WARNING:
			log.warn(message.toString());
			break;
		}
	}

}

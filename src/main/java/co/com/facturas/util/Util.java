package co.com.facturas.util;

import org.apache.log4j.Logger;

public class Util {

	private Util() {

		throw new IllegalStateException("Utiility Class");
	}

	protected final static Logger log = Logger.getLogger(Util.class);

	private static Logger getLogger() {
		if (log == null) {
			try {
				new Util();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return log;
	}

	public static void registarInfo(Class<?> clazz, TipoLog tipo, Object message) {

		switch (tipo) {
		case DEBUG:
			if (getLogger().isDebugEnabled()) {
				getLogger().debug(message.toString());
			}
			break;
		case ERROR:
			getLogger().error(message.toString());
			break;
		case FATAL:
			getLogger().fatal(message.toString());
			break;
		case INFO:
			getLogger().info(message.toString());
			break;
		case WARNING:
			getLogger().warn(message.toString());
			break;

		}
	}

}

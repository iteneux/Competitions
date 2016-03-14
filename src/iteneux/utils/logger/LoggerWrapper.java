package iteneux.utils.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerWrapper {

	public static final String LOG_FILE = "logFile.log";
	public static final Logger logger = Logger.getLogger("CompetitionLogger");

	private static LoggerWrapper instance = null;

	public static LoggerWrapper getInstance() {
		
		if (instance == null) {
			prepareLogger();
			instance = new LoggerWrapper();
		}
		
		return instance;
	}

	private static void prepareLogger() {
		FileHandler fh = null;
		
		try {
			fh = new FileHandler(LOG_FILE, true);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		LoggerFormatter formatter = new LoggerFormatter();
		fh.setFormatter(formatter);
		
		logger.addHandler(fh);
		logger.setUseParentHandlers(false);
		logger.setLevel(Level.FINEST);
	}

}

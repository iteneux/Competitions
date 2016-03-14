package iteneux.utils.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LoggerFormatter extends Formatter {
	private static final DateFormat df = new SimpleDateFormat("[dd.MM.yyyy HH:mm:ss.SSS]");

	public String format(LogRecord record) {
		StringBuilder builder = new StringBuilder(1000);

		builder.append(df.format(new Date(record.getMillis()))).append(" - ");
		builder.append("[");
		builder.append(record.getLevel());
		builder.append("] ");
		builder.append("<");
		builder.append(record.getSourceClassName());
		builder.append("> ");
		builder.append(record.getSourceMethodName());
		builder.append(": ");
		builder.append(record.getMessage());
		builder.append("\n");

		return builder.toString();
	}

}

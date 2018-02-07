package al.ikubinfo.logging;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class LoggingUtils {
	
	public static final Logger LOG_FE = LogManager.getLogger("CTS-FE-Log");

	public static String parseStackTrace(Exception e) {
		LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
		File file = new File("/WEB-INF/log4j2.xml");
		
		
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		String stacktrace = sw.toString();
		return stacktrace;
	}

}

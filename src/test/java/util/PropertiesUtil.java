package util;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.EnumMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author c
 * @date 2018年12月14日 下午3:43:27
 */
public class PropertiesUtil {
	//private static final Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);
	private static final Map<PropertiesEnumUtil, Properties> PROPERTIES = new EnumMap<PropertiesEnumUtil, Properties>(PropertiesEnumUtil.class);;
	private static final String CODING = "UTF-8";

	static {
		initialization();
	}

	private static void initialization() {
		PROPERTIES.put(PropertiesEnumUtil.JDBC, load("jdbc.properties"));
		PROPERTIES.put(PropertiesEnumUtil.ENCRYP, load("encryp.properties"));
		PROPERTIES.put(PropertiesEnumUtil.TESTURL,load("testUrl.properties"));
	}

	private static Properties load(String propertiesName) {
		try {
			Properties prop = new Properties();
			Reader reader = new InputStreamReader(
					PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesName), CODING);
			prop.load(reader);
			return prop;
		} catch (IOException e) {
			//logger.error(e.getMessage(), e);
			return null;
		}
	}

	// 静态方法可以被类名直接调用
	public static String getValue(PropertiesEnumUtil properties, String key) {
		return PROPERTIES.get(properties).getProperty(key);
	}

	public static void main(String args[]){
	 String DBUsername=getValue(PropertiesEnumUtil.JDBC,"username");
	}
}
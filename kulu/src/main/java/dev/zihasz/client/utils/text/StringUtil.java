package dev.hydraontopp.client.utils.text;

import dev.hydraontopp.client.utils.Util;

public class StringUtil implements Util {

	public static String removeLastChar(String string) {
		return string.substring(0, string.length() - 1);
	}

}

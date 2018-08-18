package com.brainstuds.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public interface commonUtils {
	public static String convertPrintStackTraceIntoString(Exception e){
	StringWriter sw =new StringWriter();
	PrintWriter pw = new PrintWriter(sw);
	e.printStackTrace(pw);
	String result = sw.toString();
	return result;
	}
}

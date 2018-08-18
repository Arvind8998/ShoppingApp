package com.brainstuds.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public final class LangReader {

	private static String currentLang;
	private LangReader(){
		
	}
	
	public static void setLang(String lang){
		currentLang = lang;
		getResource();
	}

    private static ResourceBundle rb;
     
    public static void getResource(){
    	Locale locale = new Locale(currentLang);
    	rb = ResourceBundle.getBundle("messages", locale);
    }
    
    public static String getValue(String key){
    	return rb.getString(key);
    }
}


package shoppingapp;

import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.brainstuds.utils.CacheLoader;

public class ServletStartAndShutDownListener  implements ServletContextListener{
	
public ServletStartAndShutDownListener(){
	
	
	
}

public void contextDestroyed(ServletContextEvent arg0){
	
	CacheLoader.cleanCache();
}

public void contextInitialized(ServletContextEvent arg0) {
	System.out.println("SERVER START....");
	System.out.println("CACHE LOADING...");
		
	try {
		CacheLoader.loadcache();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.print("cache loaded");
	
}



}

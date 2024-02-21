package fr.jpa.conn;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ApplicationConn implements ServletContextListener {

	private static EntityManagerFactory emf;

	public static EntityManagerFactory getEmf() {
		return emf;
	}

	public static void setEmf(EntityManagerFactory emf) {
		ApplicationConn.emf = emf;
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		if(ApplicationConn.emf != null && ApplicationConn.emf.isOpen()) {
			ApplicationConn.emf.close();
		}
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ApplicationConn.emf = Persistence.createEntityManagerFactory("JPA");
	}
}

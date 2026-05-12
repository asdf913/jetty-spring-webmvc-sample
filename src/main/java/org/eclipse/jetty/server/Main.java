package org.eclipse.jetty.server;

import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.ee10.servlet.ServletHolder;
import org.springframework.web.servlet.DispatcherServlet;

public class Main {

	public static void main(final String[] args) throws Exception {
		//
		final ServletContextHandler servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
		//
		servletContextHandler.setContextPath("/");
		//
		final DispatcherServlet dispatcherServlet = new DispatcherServlet();
		//
		dispatcherServlet.setContextConfigLocation("classpath:applicationContext.xml");
		//
		servletContextHandler.addServlet(new ServletHolder(dispatcherServlet), "/");
		//
		final Server server = new Server(8080);
		//
		server.setHandler(servletContextHandler);
		//
		server.start();
		//
		server.join();
		//
	}

}
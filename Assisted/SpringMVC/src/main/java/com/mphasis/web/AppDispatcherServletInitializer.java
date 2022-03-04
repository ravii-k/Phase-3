package com.mphasis.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// loasad the dispatcher servlet
public class AppDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  public AppDispatcherServletInitializer() {
	  System.out.println("AppDispatcherServletInitializer constructor");
  }
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("get servlet config classes");
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("get servlet mapping");
		// TODO Auto-generated method stub
		
		return new String[] {"/"};
	}

	
	}



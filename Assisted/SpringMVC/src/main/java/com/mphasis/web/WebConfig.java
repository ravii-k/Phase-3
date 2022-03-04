package com.mphasis.web;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
// web related configuration
@Configuration
@ComponentScan
public class WebConfig implements WebMvcConfigurer{
	public WebConfig() {
		System.out.println("webConfig Constructor");
	}
	@Bean
	public ViewResolver viewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/WEB-INF/pages/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	}
	/**Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...*/
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
	      }

@Bean
public DataSource dataSource() {
	System.out.println("connecting to db");
	DriverManagerDataSource ds = new DriverManagerDataSource();
	ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	ds.setUsername("Ravi_admin");
	ds.setPassword("tiger");
	return ds;
}

@Bean
@Autowired
public JdbcTemplate template(DataSource ds) {
	System.out.println("connecting jdbc template");
	return new JdbcTemplate(ds);
}
}
package com.component.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class UrlMappingFilter implements Filter {

	private ServletContext servletContext;
	
	private String[] ignoreEXT;
	private String PERFIX = "/forum";
	
	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
			HttpServletRequest request = (HttpServletRequest) req;
			String uri = request.getRequestURI();
			
			for(String ext : ignoreEXT){
				if(uri.endsWith(ext)){
                    int idx = PERFIX.length();
                    uri = uri.substring(idx);
                    RequestDispatcher rd = request.getRequestDispatcher(uri);
                    rd.forward(req, res);
					return;
				}
			}
            chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		servletContext = config.getServletContext();
		
		ignoreEXT = config.getInitParameter("ignoreEXT").split(",");
		PERFIX = config.getInitParameter("perfix");
	}

}

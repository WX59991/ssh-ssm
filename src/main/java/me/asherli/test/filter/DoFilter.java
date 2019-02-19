package me.asherli.test.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Administrator on 2019/2/19.
 */
public class DoFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("初始化过滤器");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
		httpServletRequest.getRequestURL();
		System.out.println("请求路径");
		httpServletRequest.getRequestDispatcher("/hello.html").forward(httpServletRequest,servletResponse);
	}

	@Override
	public void destroy() {
		System.out.println("销毁了");
	}
}

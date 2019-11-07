package com.sherry.ideaTest.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class JSPfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest rep=(HttpServletRequest)servletRequest;
        String url = rep.getRequestURI();
        HttpServletResponse res = (HttpServletResponse)servletResponse;
        res.sendRedirect(url.replaceAll("jsp","html"));
    }

    @Override
    public void destroy() {

    }
}

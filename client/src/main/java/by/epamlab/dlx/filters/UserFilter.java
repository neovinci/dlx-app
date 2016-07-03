package by.epamlab.dlx.filters;

import by.epamlab.dlx.model.beans.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Sergei Astapenko on 21.06.2016.
 */
public class UserFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user == null && !"/locale.do".equals(request.getServletPath()) && !"/login.do".equals(request.getServletPath())) {
            response.sendRedirect("/login.jsp");
            return;
        }

        filterChain.doFilter(request, response);
    }

    public void destroy() {

    }
}

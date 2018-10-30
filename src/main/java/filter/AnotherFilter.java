package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lanyage on 2018/10/30.
 */
public class AnotherFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("This is Another Filter before.");
        chain.doFilter(request,response);
        System.out.println("This is Another Filter after.");
    }

    @Override
    public void destroy() {

    }
}

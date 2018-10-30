package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lanyage on 2018/10/30.
 */
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String testParam = filterConfig.getInitParameter("testParam");
        System.out.println(filterConfig.getServletContext().getAttribute("globalParam"));
        System.out.println(testParam);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("This is Hello Filter before.");
        chain.doFilter(request,response);   //此处涉及很多业务逻辑。不一定会继续执行。
        System.out.println("This is Hello Filter after.");
    }

    @Override
    public void destroy() {

    }
}

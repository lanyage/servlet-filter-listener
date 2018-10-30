package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by lanyage on 2018/10/30.
 */
public class HelloContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(">>>>>>" + sce.getServletContext());
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("globalParam", "globalParam");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

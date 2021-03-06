/*************************************************************************************************************************************************************************
     *
     * Purpose : used toGet method to allow servlet to handle the request
     *
     *         : create my First servlet
     *
     * Author : Immanuvel Jeeva
     * Since  : 08-09-2021
     *
     ********************************************************************************************************************************************************************/
package FirstServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( "/ServletMain" )
public class ServletMain extends HttpServlet {

    /******************************************************************************************************************
     *
     * Purpose : used toGet method to allow servlet to handle the request
     *
     *****************************************************************************************************************/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h3>Hello World! Welcome to Servlet Programming!");
        out.println("<p>Welcome for my First server");
        out.close();
    }
}

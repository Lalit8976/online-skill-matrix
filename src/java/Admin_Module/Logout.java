package Admin_Module;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author AJIT PATHAK-G
 */
public class Logout extends HttpServlet 
{

      protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            HttpSession session=request.getSession();
            String user=(String)session.getAttribute("user_id");
            String pswd=(String)session.getAttribute("pswd");
            if(user==null &&pswd==null)
            {
                response.sendRedirect("Login?msg=Please login first");
            }
           session.removeAttribute("userid");
           session.removeAttribute("pswd");
           response.sendRedirect("Login?msg=Log Out Successfully");
        }
        catch(Exception e)
        {
            out.close();
            e.printStackTrace();
        }
    }
}

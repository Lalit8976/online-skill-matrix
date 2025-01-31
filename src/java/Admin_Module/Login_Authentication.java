package Admin_Module;
import DB.DBCon;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login_Authentication extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
      {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Member_Home</title>");            
            out.println("</head>");
            out.println("<body>");
            String v1=request.getParameter("t1");
            String v2=request.getParameter("t2");
            DBCon db=new DBCon();
            db.stmt=db.con.createStatement();
            db.rst=db.stmt.executeQuery("select type from login where u_name='"+v1+"' and pswd='"+v2+"'");
           
            if(db.rst.next())
            {
                String type=db.rst.getString(1);
                if(type.equals("admin"))
                {
                    
                    HttpSession session=request.getSession();
                    session.setAttribute("user_id",v1);
                    session.setAttribute("pswd",v2);
                    response.sendRedirect("Admin?msg="+v1);
                }
                else
                {
                    
                    HttpSession session=request.getSession();
                    session.setAttribute("user_id",v1);
                    session.setAttribute("pswd",v2);
                    response.sendRedirect("Member?msg="+v1);
                }
            }
            else
            {
               out.println("msg=Make sure your username or passord is correct??");
            }
            out.println("</body></html>");
        }catch(Exception e)
        {
            out.close();
            e.printStackTrace();
        }
    }
}

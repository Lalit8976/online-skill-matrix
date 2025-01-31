package Member_Module;
import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author AJIT PATHAK-G
 */
public class Feedback_Conf extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            String user=request.getParameter("name");
            String mail=request.getParameter("email");
            String ques_no=request.getParameter("qno");
            String subject=request.getParameter("sub");
            String query=request.getParameter("query");
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("insert into feedback values(?,?,?,?,?)");
            db.pstmt.setString(1,user);
            db.pstmt.setString(2,mail);
            db.pstmt.setString(3,ques_no);
            db.pstmt.setString(4,subject);
            db.pstmt.setString(5,query);
            int i1=db.pstmt.executeUpdate();           
            if(i1>0)
            {
                response.sendRedirect("Feedback?msg=Submit successfully");
                
            }
            else
            {
                response.sendRedirect("Feedback2?msg=Something happened wrong");
            }
         } 
        catch(Exception e)
        {
            e.printStackTrace();
            out.close();
        }
    }

   }
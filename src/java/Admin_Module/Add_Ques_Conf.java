package Admin_Module;
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
public class Add_Ques_Conf extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
           String value1=request.getParameter("queid");
           String value2=request.getParameter("que");
           String value3=request.getParameter("op1");
           String value4=request.getParameter("op2");
           String value5=request.getParameter("op3");
           String value6=request.getParameter("op4");
           String value7=request.getParameter("ans");
           DBCon db=new DBCon();
           db.pstmt=db.con.prepareStatement("insert into ques_mstr values(?,?,?,?,?,?,?)");
           db.pstmt.setString(1, value1);
           db.pstmt.setString(2, value2);
           db.pstmt.setString(3, value3);
           db.pstmt.setString(4, value4);
           db.pstmt.setString(5, value5);
           db.pstmt.setString(6, value6);
           db.pstmt.setString(7, value7);
           int i=db.pstmt.executeUpdate();
           if(i>0)
           {
               response.sendRedirect("Add_Ques?msg=Question Added Successfully");
           }
           else
           {
               response.sendRedirect("Add_Ques?msg=Error......");
           }
        }
        catch(Exception e)
        {
            out.close();
            e.printStackTrace();
        }
    }
}

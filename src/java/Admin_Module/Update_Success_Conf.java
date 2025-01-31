package Admin_Module;
import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Update_Success_Conf extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            String que=request.getParameter("que");
            String op1=request.getParameter("op1");
            String op2=request.getParameter("op2");
            String op3=request.getParameter("op3");
            String op4=request.getParameter("op4");
            String ans=request.getParameter("ans"); 
            String queid=request.getParameter("queid");
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("update ques_mstr set que=?,op1=?,op2=?,"
                    + "op3=?,op4=?,ans=? where ques_id=?");
            db.pstmt.setString(1,que);
            db.pstmt.setString(2,op1);
            db.pstmt.setString(3,op2);
            db.pstmt.setString(4,op3);
            db.pstmt.setString(5,op4);
            db.pstmt.setString(6,ans);
            db.pstmt.setString(7,queid);
            int i=db.pstmt.executeUpdate();
            if(i>0)
            {
                response.sendRedirect("Update_Ques?msg=Record UpDate Successfully</h2>");
            }
            else
            {
                response.sendRedirect("Update_Ques?msg=Record does not Upadte</h2>");
            }
            out.println("</div>");
            out.println("</div></form></center></body>");
            out.println("</html>");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
            
      
package Member_Module;
import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author AJIT PATHAK-G
 */
public class Start_Exam extends HttpServlet 
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>StartExam</title>");            
            out.println("</head>");
            out.println("<body bgcolor=khaki><center>");
            out.println("<form action=Answer_Match>");
            DBCon db=new DBCon();
            db.stmt=db.con.createStatement();
            db.rst=db.stmt.executeQuery("select * from ques_mstr");
            out.println("<table width=1000px cellspacing=0>");
            int i=1;
            while(db.rst.next())
            {
                out.println("<tr height=30px><td colspan=4 style='background-color:'>"
                        + "<b style='font-size:20px;'>Ques :"+db.rst.getString(1)+"</b>&nbsp;&nbsp;&nbsp;&nbsp;"
                        + "<b>"+db.rst.getString(2)+"</b></td></tr>"
                        + "<tr height=25px style='background-color:ghostwhite'><td><input type=radio value='"+db.rst.getString(3)+"'name=ans'"+i+"'>"
                        + "<b style='color:blueviolet;'>A :</b>&nbsp;&nbsp;"+db.rst.getString(3)+"</td>"
                        + "<td><input type=radio value='"+db.rst.getString(4)+"'name=ans'"+i+"'>"
                        + "<b style='color:blueviolet;'>B :</b>&nbsp;&nbsp;"+db.rst.getString(4)+"</td>"
                        + "<tr height=25px style='background-color:ghostwhite'><td><input type=radio value='"+db.rst.getString(5)+"'name=ans'"+i+"'>"
                        + "<b style='color:blueviolet;'>C :</b>&nbsp;&nbsp;"+db.rst.getString(5)+"</td>"
                        + "<td><input type=radio value='"+db.rst.getString(6)+"'name=ans'"+i+"'>"
                        + "<b style='color:blueviolet;'>D :</b>&nbsp;&nbsp;"+db.rst.getString(6)+"</td></tr>");
            i++;
            }
            out.println("<tr height=40px><th colspan=4><input type=submit value=SUBMIT style='width:100px;background-color:blue;color:white;'></th></tr>");
            out.println("<h5></h5></table></form><center></body>");
            out.println("</html>");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
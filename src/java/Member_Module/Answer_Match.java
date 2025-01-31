package Member_Module;
import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author AJIT PATHAK-G
 */
public class Answer_Match extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>AnswerMatch</title>");            
            out.println("</head>");
            out.println("<body bgcolor=#DCDCDC><center>");
            String ans[]=new String[30];
            int i,count=1,atpt=0;
            for(i=0;i<ans.length;i++)
            {
                if(request.getParameter("ans'"+count+"'")!=null)
                {
                    ans[i]=request.getParameter("ans'"+count+"'");
                    atpt++;
                }
                else
                {
                    ans[i]="no";
                }
                count++;
             } 
            DBCon db=new DBCon();
            db.stmt=db.con.createStatement();
            db.rst=db.stmt.executeQuery("select ans from ques_mstr");    
            i=0;
            int marks=0; 
            while(db.rst.next())
            {  
                if(ans[i].equals(db.rst.getString(1)))
                {
                    marks=marks+5;
                }
                    i++;                
             }            
            HttpSession session=request.getSession();
            String userid=(String) session.getAttribute("user_id");
            int c_ans=marks/5;
            db.pstmt=db.con.prepareStatement("delete from result_mstr where user_id=?");
            db.pstmt.setString(1, userid);
            db.pstmt.executeUpdate();
            db.pstmt=db.con.prepareStatement("insert into result_mstr values(?,curdate(),?,?,?)");
            db.pstmt.setString(1, userid);
            db.pstmt.setString(2, String.valueOf(marks));
            db.pstmt.setString(3,String.valueOf(atpt));
            db.pstmt.setString(4, String.valueOf(c_ans));
            int rec=db.pstmt.executeUpdate();
            out.println("<center><br><br><h2>Report Card</H2><br><table width=500 border=2>"
                    + "");
            if(rec>0)
            {
                out.println("<tr><td width=250>User ID</td><td>"+userid+"</td></tr>");
                out.println("<tr><td>Date Of Exam</td><td>"+new Date()+"</td></tr>");
                out.println("<tr><td>marks</td><td>"+marks+"</td></tr>");
                out.println("<tr><td>Total Attempt</td><td>"+atpt+"</td></tr>");
                out.println("<tr><td>Correct Question</td><td>"+c_ans+"</td></tr></table>");  
                out.println("<br><br><br><a href=Member>Home Page</a>");
            } 
            out.println("</center></body>");
            out.println("</html>");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

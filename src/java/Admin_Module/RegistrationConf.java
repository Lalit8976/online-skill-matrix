package Admin_Module;
import DB.DBCon;
import java.sql.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationConf extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String user=request.getParameter("t1");
            String pswd=request.getParameter("t2");
           // String r_date=request.getParameter("t3");
            String dob=request.getParameter("t4");
            String gen=request.getParameter("t5");
            String qua1=request.getParameter("t6");
            String qua2=request.getParameter("t7");
            String addr=request.getParameter("t8");
            String city=request.getParameter("t9");
            String cont=request.getParameter("t10");
            String mail=request.getParameter("t11");
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("insert into login values(?,?,?)");
            db.pstmt.setString(1,user);
            db.pstmt.setString(2,pswd);
            db.pstmt.setString(3,"member");
            PreparedStatement pstmt1=db.con.prepareStatement("insert into user_info values(?,?,?,?,?,?,?,?,?,?,?)");
            pstmt1.setString(1,user);
            pstmt1.setString(2,pswd);
            pstmt1.setString(3,new Date().toString());
            pstmt1.setString(4,dob);
            pstmt1.setString(5,gen);
            pstmt1.setString(6,qua1);
            pstmt1.setString(7,qua2);
            pstmt1.setString(8,addr);
            pstmt1.setString(9,city);
            pstmt1.setString(10,cont);
            pstmt1.setString(11,mail);
            int i1=db.pstmt.executeUpdate();
            int i2=pstmt1.executeUpdate();
            if(i1>0&&i2>0)
            {
                response.sendRedirect("Login?msg=Registered successfully "+user+"-G");
                
            }
            else
            {
                response.sendRedirect("Registration2?msg=Something happen wrong!!!!!!!!!!!!!");
            }
         } 
        catch(Exception e)
        {
            e.printStackTrace();
            out.close();
        }
    }

   }

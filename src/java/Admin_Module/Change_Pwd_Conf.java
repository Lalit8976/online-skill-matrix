/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_Module;

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
public class Change_Pwd_Conf extends HttpServlet 
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
            String v1=request.getParameter("t1");
            String v2=request.getParameter("t2");
            String v3=request.getParameter("t3");
            String v4=request.getParameter("t4");
            DBCon db=new DBCon();          
            if(user.equals(v1))
            {
                if(pswd.equals(v2))
                {
                    if(v3.equals(v4))
                    { 
                        db.pstmt=db.con.prepareStatement("update login,user_info set login.pswd=?,user_info.pswd=? where login.u_name=? and user_info.u_name=?");
                        db.pstmt.setString(1,v3);
                        db.pstmt.setString(2,v3);
                        db.pstmt.setString(3,v1);
                        db.pstmt.setString(4,v1);
                        int i=db.pstmt.executeUpdate();
                        if(i>0)
                        {
                              response.sendRedirect("Member?msg=Password changed successfully");
                        }
                    }
                    else
                    {
                        response.sendRedirect("Change_Password?msg=New and Confirm password does not match plz try again");
                    }
                }
                else
                {
                    response.sendRedirect("Change_Password?msg=Old Password does not match");
                }
            }
            else
            {
                response.sendRedirect("Change_Password?msg=Username does not exist");
            }
        }
        catch(Exception e)
        {         
            e.printStackTrace();
            out.close();
        }
    }
}

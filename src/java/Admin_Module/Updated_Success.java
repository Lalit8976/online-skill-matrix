package Admin_Module;
import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Updated_Success extends HttpServlet {
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
            out.println("<title>Updating</title>");
            out.println("<style>"
                +".style1{color:blue;text-decoration:none;font-size:15px;background-color:white;}"
                +".style1:hover{font-size:17px;color:red;}"
                +".style2{color:white;text-decoration:none;font-size:16px;}"
                +".style2:hover{font-size:15px;color:blue;}</style>");
            out.println("</head>");
            out.println("<body bgcolor=#DCDCDC><center>");
            out.println("<div style='width:900px;height:180px;background-image:url(Images/adminBanner.jpg);'></div>"
                    +"<div style='width:900px;height:20px;background-color:white;'>"
                    +"<div style='width:250px;height:20px;float:left;'>"
                    + "<marquee direction=right style='color:gray;font-weight:bold;'>"
                    +"Online Examinatiion System</marquee></div>"
                    +"<div style='width:10px;height:20px;background-image:url(image/nav1.png);float:left;'></div>"
                    +"<div style='width:640px;height:20px;background-color:black;float:left;'>"
                    +"<table width=590px height=20px border=0>"
                +"<tr>"
                    +"<td style='width:3px'>&nbsp</td><td style='width:115px;text-align:center;'>"
                    + "<a href='Home'class='style2'>Home</a></td>"
                    +"<td style='width:3px'>&nbsp</td><td style='width:115px;text-align:center;'>"
                    + "<a href='AdminCngPswd'class='style2'>Change Password</a></td>"
                    +"<td style='width:3px'>&nbsp</td><td style='width:115px;text-align:center;'>"
                    + "<a href='LogOut'class='style2'>Log Out</a></td>"
                    +"<td style='width:3px'>&nbsp</td>"
                +"</tr>"
                +"</table>"
                +"</div>"
                +"</div>");    
            out.println("<div style='width:900px;height:450px;'>"
                    + "<div style='width:250px;height:450px;background-color:#CCCCCC;float:left;text-align:left;"
                    + "font-size:15px;color:white;border-style:grove;'>"
                    + "<h1 style='text-align:center'>Admin Module</h1>"
                    + "<ul type=box &raquo;>"
                         + "<li><a href='View_User_Detail' class='style1'>View&nbsp;Student&nbsp;Information&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='Search_User' class='style1'>Serach Student&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='Add_Ques' class='style1'>Add Question&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='Update_Ques' class='style1'>Update Question&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='Delete_Ques' class='style1'>Delete Question&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='View_All_Ques' class='style1'>View Question List&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                       // + "<br><li><a href='View_Result' class='style1'>View Result&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='View_Feedback' class='style1'>View Feedback&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='Add_News' class='style1'>Add News&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "<br><li><a href='Delete_News' class='style1'>Delete News&nbsp;&nbsp;&raquo;&raquo;</a></li>"
                        + "</ul></div>");
            out.println("<div style='width:650px;height:450px;background-color:#DBFDB4;float:right;'>");
            String queid=request.getParameter("questionId");
            DBCon db=new DBCon();
            db.stmt=db.con.createStatement();
            db.rst=db.stmt.executeQuery("select * from ques_mstr where ques_id='"+queid+"'");
            if(db.rst.next())
            {
                out.println("<form action =Update_Success_Conf><input type=hidden name=queid value="+queid+">"
                        + "<table width=300px border=0>"
                        + "<br><br><h1>Your Question Was.......?</h1>"
                        + "<tr height=30><td>Question Id<b>:-</b></td><td style='text-align:center;'>"+db.rst.getString(1)+"</td></tr>"
                        + "<tr height=30><td>Question<b>:-</b></td><td><input type=text name=que value='"+db.rst.getString(2)+"'></td></tr>"
                        + "<tr height=30><td>Option 1<b>:-</b></td><td><input type=text name=op1 value='"+db.rst.getString(3)+"' style='text-align:center;'></td></tr>"
                        + "<tr height=30><td>Option 2<b>:-</b></td><td><input type=text name=op2 value='"+db.rst.getString(4)+"' style='text-align:center;'></td></tr>"
                        + "<tr height=30><td>Option 3<b>:-</b></td><td><input type=text name=op3 value='"+db.rst.getString(5)+"' style='text-align:center;'></td></tr>"
                        + "<tr height=30><td>Option 4<b>:-</b></td><td><input type=text name=op4 value='"+db.rst.getString(6)+"' style='text-align:center;'></td></tr>"
                        + "<tr height=30><td>Answer<b>:-</b></td><td><input type=text name=ans value='"+db.rst.getString(7)+"' style='text-align:center;'></td></tr>"
                        + "<tr><td></td><td><input type=submit value=UPDATE>&nbsp;&nbsp;&nbsp;<input type=reset value=RESET></td></tr></table></form>");
            }
            else
            {
                response.sendRedirect("Update_Ques?msg=Question Id  does Not Matched");
            }
            out.println("</div>");
            out.println("</div></center></body></html>");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

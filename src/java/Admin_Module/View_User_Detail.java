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
public class View_User_Detail extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
            out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Skill Matrix</title>\n" +
"    <style type=\"text/css\">body {\n" +
"        font-family: Arial, sans-serif;\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"    }\n" +
"    \n" +
"    .header {\n" +
"        background-color: #f0f0f0;\n" +
"        padding: 10px;\n" +
"        text-align: center;\n" +
"        border-bottom: 2px solid #ccc;\n" +
"    }\n" +
"    \n" +
"    .header .logo {\n" +
"        width: 50px;\n" +
"        vertical-align: middle;\n" +
"        margin-right: 10px;\n" +
"    }\n" +
"    \n" +
"    .container {\n" +
"        display: flex;\n" +
"    }\n" +
"    .navbar {\n" +
"        background-color: #333;\n" +
"        overflow: hidden;\n" +
"    }\n" +
"    \n" +
"    .navbar ul {\n" +
"        list-style-type: none;\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"    }\n" +
"    \n" +
"    .navbar ul li {\n" +
"        float: left;\n" +
"    }\n" +
"    \n" +
"    .navbar ul li a {\n" +
"        display: block;\n" +
"        color: white;\n" +
"        text-align: center;\n" +
"        padding: 14px 20px;\n" +
"        text-decoration: none;\n" +
"    }\n" +
"    \n" +
"    .navbar ul li a:hover {\n" +
"        background-color: #ddd;\n" +
"        color: black;\n" +
"    }\n" +
"    .main {\n" +
"        flex-grow: 1;\n" +
"        padding: 20px;\n" +
"    }\n" +
"    \n" +
"    .main h2 {\n" +
"        font-size: 24px;\n" +
"        margin-bottom: 20px;\n" +
"    }\n" +
"    \n" +
"    form {\n" +
"        display: flex;\n" +
"        flex-direction: column;\n" +
"    }\n" +
"    \n" +
"    form label {\n" +
"        font-size: 14px;\n" +
"        margin-bottom: 5px;\n" +
"    }\n" +
"    \n" +
"    form input[type=\"text\"] {\n" +
"        font-size: 14px;\n" +
"        padding: 8px;\n" +
"        margin-bottom: 15px;\n" +
"        border: 1px solid #ccc;\n" +
"        border-radius: 4px;\n" +
"    }\n" +
"    \n" +
"    form .buttons {\n" +
"        display: flex;\n" +
"        gap: 10px;\n" +
"    }\n" +
"    \n" +
"    form .buttons button {\n" +
"        padding: 10px 15px;\n" +
"        border: none;\n" +
"        border-radius: 4px;\n" +
"        cursor: pointer;\n" +
"        font-size: 14px;\n" +
"    }\n" +
"    \n" +
"    form .buttons button[type=\"submit\"] {\n" +
"        background-color: #4CAF50;\n" +
"        color: white;\n" +
"    }\n" +
"    \n" +
"    form .buttons button[type=\"reset\"] {\n" +
"        background-color: #f44336;\n" +
"        color: white;\n" +
"    }\n" +
"    \n" +
"    \n" +
"    .sidebar {\n" +
"        width: 300px;\n" +
"        background-color: #e0e0e0;\n" +
"        padding: 13px;\n" +
"        height: 500px;\n" +
"        border-right: 2px solid #ccc;\n" +
"    }\n" +
"    \n" +
"    .sidebar h2 {\n" +
"        font-size: 22px;\n" +
"        margin-bottom: 15px;\n" +
"    }\n" +
"    \n" +
"    .sidebar ul {\n" +
"        list-style-type: none;\n" +
"        padding: 0;\n" +
"    }\n" +
"    \n" +
"    .sidebar ul li {\n" +
"        margin-bottom: 18px;\n" +
"    }\n" +
"    \n" +
"    .sidebar ul li a {\n" +
"        text-decoration: none;\n" +
"        color: #333;\n" +
"        font-size: 20px;\n" +
"        \n" +
"    }\n" +
"    .sidebar ul li :hover {\n" +
"        font-size: 22px;\n" +
"    \n" +
"        color: red;\n" +
"    }\n" +
"    \n" +
"    \n" +
"    .main {\n" +
"        flex-grow: 1;\n" +
"        padding: 20px;\n" +
"    }\n" +
"    \n" +
"    .main h2 {\n" +
"        font-size: 24px;\n" +
"        margin-bottom: 20px;\n" +
"    }\n" +
"    \n" +
"    form {\n" +
"        display: flex;\n" +
"        flex-direction: column;\n" +
"        padding:0px 100px 0px 100px;\n" +
"    }\n" +
"    \n" +
"    form label {\n" +
"        font-size: 14px;\n" +
"        margin-bottom: 5px;\n" +
"    }\n" +
"    \n" +
"    form input[type=\"text\"],\n" +
"    form textarea {\n" +
"        font-size: 14px;\n" +
"        padding: 8px;\n" +
"        margin-bottom: 15px;\n" +
"        border: 1px solid #ccc;\n" +
"        border-radius: 4px;\n" +
"    }\n" +
"    \n" +
"    form textarea {\n" +
"        height: 100px;\n" +
"        resize: none;\n" +
"    }\n" +
"    \n" +
"    form .buttons {\n" +
"        display: flex;\n" +
"        gap: 10px;\n" +
"    }\n" +
"    \n" +
"    form .buttons button {\n" +
"        padding: 10px 15px;\n" +
"        border: none;\n" +
"        border-radius: 4px;\n" +
"        cursor: pointer;\n" +
"        font-size: 14px;\n" +
"    }\n" +
"    \n" +
"    form .buttons button[type=\"submit\"] {\n" +
"        background-color: #4CAF50;\n" +
"        color: white;\n" +
"    }\n" +
"    \n" +
"    form .buttons button[type=\"reset\"] {\n" +
"        background-color: #f44336;\n" +
"        color: white;\n" +
"    }\n" +
"    </style>\n" +
"    <link rel=\"stylesheet\" href=\"style1.css\">\n" +
"</head>\n" +
"<body>\n" +
"    <div class=\"header\">\n" +
"       \n" +
"        <h1>Skill Matrix</h1>\n" +
"    </div>\n" +
"    <div class=\"navbar\">\n" +
"        <ul>\n" +
"            <li><a href=\"Login\">Home</a></li>\n" +
"            <li><a href=\"Change_Password\">Change Password</a></li>\n" +
"            <li><a href=\"Logout\">Logout</a></li>\n" +
"        </ul>\n" +
"    </div>\n" +
"    <div class=\"container\">\n" +
"        <div class=\"sidebar\">\n" +
"            <h2>Admin Module</h2>\n" +
"            <ul>\n" +
"                <li><a href=\"View_User_Detail\">View Student Information</a></li>\n" +
"                <li><a href=\"Search_User\">Search Student</a></li>\n" +
"                <li><a href=\"Add_Ques\">Add Question</a></li>\n" +
"                <li><a href=\"Update_Ques\">Update Question</a></li>\n" +
"                <li><a href=\"Delete_Ques\">Delete Question</a></li>\n" +
"                <li><a href=\"View_All_Ques\">View Question List</a></li>\n" +
"                <li><a href=\"View_Feedback\">View Feedback</a></li>\n" +
"            </ul>\n" +
"        </div>\n" +
"        <div class=\"main\">\n" );
           DBCon db=new DBCon();
             db.stmt=db.con.createStatement();
             db.rst=db.stmt.executeQuery("SELECT user_info.u_name,login.pswd,"
                     + "user_info.d_reg,user_info.dob,user_info.gender,user_info.quali1,user_info.addr,user_info.city,"
                     + "user_info.contact,user_info.email FROM login, user_info WHERE user_info.u_name=login.u_name");
             out.println("<table width=890 border=1 cellspacing=0><br><b><span style='color:red;'>All User Details</span></b><br><tr><th>User Name</th><th>Password</th>"
                     + "<th>Registration Date</th><th>Birth Date</th><th>Gender</th><th>Qualification</th><th>Address</th>"
                     + "<th>City</th><th>Contact</th><th>Email</th></tr>");
                 while(db.rst.next())
             {                
                 out.println("<tr><td style='text-align:center;'>"+db.rst.getString(1)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(2)+"</td>"
                         +"<td style='text-align:center;'>"+db.rst.getString(3)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(4)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(5)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(6)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(7)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(8)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(9)+"</td>"
                         + "<td style='text-align:center;'>"+db.rst.getString(10)+"</td></tr>");
             }
out.println("    </div>\n" +
"    </div>\n" +
"</body>\n" +
"</html>"
                    );
         }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

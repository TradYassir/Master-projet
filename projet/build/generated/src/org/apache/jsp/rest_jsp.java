package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import classes.Patient;

public final class rest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <form action=\"MAJ\" method=\"post\">\n");
      out.write("        ");

        if(session.getAttribute("ses")!=null){
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table border=1>\n");
      out.write("            <tr><th>id</th> <th>nom</th> <th>Mise à Jour </th></tr>\n");
      out.write("         ");

            ArrayList<Patient> list = new ArrayList<Patient>(((ArrayList<Patient>)session.getAttribute("ses"))); 
            for(int i=0;i<list.size();i++){
                
      out.write("\n");
      out.write("                <tr> <td>");
      out.print(list.get(i).getId());
      out.write("<input type=\"radio\" name=\"id\" value=\"");
      out.print(list.get(i).getId());
      out.write("\"></td> <td><input type=\"text\" name=\"nom\" value=\"");
      out.print(list.get(i).getNom());
      out.write("\"></td> \n");
      out.write("                  \n");
      out.write("                </tr>\n");
      out.write("                  <td><input type=\"submit\" value=\"Modifier\" name=\"b1\" ></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Supprimer\" name=\"b1\"></td>\n");
      out.write("                ");
 } 
                
                
      out.write("\n");
      out.write("               \n");
      out.write("          </table>\n");
      out.write("        ");
 
       
        }  
        
      out.write("\n");
      out.write("        </form>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
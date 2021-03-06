package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Menu vertical parametrable</title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("window.onload = affiche;\n");
      out.write("\n");
      out.write("// ----- Fonction d'affichage des menus -----\n");
      out.write("\n");
      out.write("function affiche (id) {\n");
      out.write("\n");
      out.write("var d = document.getElementById(id);\n");
      out.write("\n");
      out.write("var nbelmenu = 4\t\t// nombre d'éléments dans le menu\n");
      out.write("\n");
      out.write("for ( var i = 1 ; i <= nbelmenu ; i++ ) {\n");
      out.write("\tif ( document.getElementById('sousmenu'+i) ) {\n");
      out.write("\t\tdocument.getElementById('sousmenu'+i).style.display='none';\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("if (d) {\n");
      out.write("\td.style.display='block';\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("var fontfamil   = \"arial, sans-serif\" ;\t// choix de la police de caractères du menu\n");
      out.write("var tailleftmen = \"90%\" ;\t\t\t\t// taille de la police du menu\n");
      out.write("var fontcolo    = \"#FFFFDD\" ;\t\t\t// couleur de la police de caractères du menu\n");
      out.write("var cellbckgrnd = \"#999966\" ;\t\t\t// couleur des cellules du menu\n");
      out.write("var positionver = 1 ;\t\t\t\t\t// position verticale du menu dans la page\n");
      out.write("var positionhor = 1 ;\t\t\t\t\t// position horizontale du menu dans la page\n");
      out.write("var largeurcell = 8 ;\t\t\t\t\t// largeur des cellules du menu\n");
      out.write("var hauteurcell = 18 ;\t\t\t\t\t// hauteur des cellules du menu\n");
      out.write("var espacemcell = 6 ;\t\t\t\t\t// espace entre les cellules du menu\n");
      out.write("var subfontfamil   = \"arial, sans-serif\" ;\t// choix de la police de caractères des sous-menus\n");
      out.write("var subtailleftmen = \"80%\" ;\t\t\t\t// taille de la police des sous-menus\n");
      out.write("var subfontcolo    = \"blue\" ;\t\t\t// couleur de la police de caractères des sous-menus\n");
      out.write("var subftsucolo    = \"#FFCC00\" ;\t\t\t// couleur de la police de sous-menus survolés\n");
      out.write("var subcellbckgrnd = \"black\" ;\t\t\t// couleur des cellules des sous-menus\n");
      out.write("var submovcellmenu = \"absolute\" ;\t\t\t// \"absolute\"=sans déplacement des cellules menu (\"relative\" = avec déplacement)\n");
      out.write("var subcellposhor  = 3 ;\t\t\t\t\t// position horizontale des cellules des sous-menus\n");
      out.write("var sublargeurcell = 6 ;\t\t\t\t\t// largeur des cellules des sous-menus\n");
      out.write("var subhauteurcell = 15 ;\t\t\t\t\t// hauteur des cellules des sous-menus\n");
      out.write("\n");
      out.write("// creation des styles CSS du menu --->\n");
      out.write("document.write( \"<style type='text/css'>\" );\n");
      out.write("\n");
      out.write("document.write( \"#menuvert {position: relative;top: \" + positionver + \"em;\" );\n");
      out.write("\tdocument.write( \"left: \" + positionhor + \"em;\" );\n");
      out.write("\tdocument.write( \"width: \" + largeurcell + \"em;}\" ) ;\n");
      out.write("\n");
      out.write("document.write( \"#menuvert dt {font-family: \" + fontfamil + \";\" ) ;\n");
      out.write("\tdocument.write( \"font-size: \" + tailleftmen + \";color: \" + fontcolo + \";\" );\n");
      out.write("\tdocument.write( \"text-align: center;background: \" + cellbckgrnd + \";\" );\n");
      out.write("\tdocument.write( \"cursor: hand;height: \" + hauteurcell )\n");
      out.write("\tdocument.write( \"px;margin: \" + espacemcell + \"px;list-style-type: none;}\" );\n");
      out.write("\n");
      out.write("document.write( \"#menuvert dd {background: \" + subcellbckgrnd + \";\" );\n");
      out.write("\tdocument.write( \"position: absolute;left: \" + subcellposhor + \"em;\" );\n");
      out.write("\tdocument.write( \"margin-top: -1em;width: \" + sublargeurcell + \"em;}\" );\n");
      out.write("\n");
      out.write("document.write( \"#menuvert li {font-family: \" + fontfamil + \";\" );\n");
      out.write("\tdocument.write( \"font-size: \" + subtailleftmen + \";list-style-type: none;\" );\n");
      out.write("\tdocument.write( \"height: \" + subhauteurcell + \"px;}\" );\n");
      out.write("\n");
      out.write("document.write( \"#menuvert li a, #menuvert dt a {color: \" + subfontcolo + \";\" );\n");
      out.write("\tdocument.write( \"text-decoration: none;}\" );\n");
      out.write("\n");
      out.write("document.write( \"#menuvert li a:hover {color: \" + subftsucolo + \";\" );\n");
      out.write("\tdocument.write( \"text-decoration: none;}\" );\n");
      out.write("\n");
      out.write("document.write( \"}</style>\" );\n");
      out.write("// FIN des styles CSS\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<dl id=\"menuvert\">\n");
      out.write("\t\n");
      out.write("\t<dt onmouseover=\"javascript:affiche('sousmenu2');\" onmouseout=\"javascript:affiche();\">Menu</dt>\n");
      out.write("\t\t<dd id=\"sousmenu2\" onmouseover=\"javascript:affiche('sousmenu2');\" onmouseout=\"javascript:affiche();\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"Nouvel_patient.jsp\">Nouvel_Patient</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Recherche.jsp\">Recherche</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</dd>\n");
      out.write("\n");
      out.write("</dl>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

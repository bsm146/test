/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2022-10-16 08:28:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import member.memberDAO;
import member.memberDTO;

public final class Write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/user/Desktop/개발/자바/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/sns/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1665908803192L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.memberDAO");
    _jspx_imports_classes.add("member.memberDTO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../CssLink/CssLink.jsp", out, true);
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Write</title>\r\n");
      out.write("<style>\r\n");
      out.write("   * { font-family: 'Spoqa Han Sans Neo', 'sans-serif'; }\r\n");
      out.write(".writeForm{\r\n");
      out.write("   background-color:#fcf7f7;\r\n");
      out.write("   border-radius:10px;\r\n");
      out.write("   height:500px;\r\n");
      out.write("   padding:30px;\r\n");
      out.write("   display:flex;\r\n");
      out.write("}\r\n");
      out.write(".texts{\r\n");
      out.write("   margin-right:30px;\r\n");
      out.write("   width:20%;\r\n");
      out.write("}\r\n");
      out.write(".texts .i2{\r\n");
      out.write("   height:48%;\r\n");
      out.write("}\r\n");
      out.write(".writeHere{\r\n");
      out.write("   width:80%;\r\n");
      out.write("}\r\n");
      out.write(".writeHere form{\r\n");
      out.write("   height:100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".writeHere input{\r\n");
      out.write("   width:100%;\r\n");
      out.write("   border: 1px;\r\n");
      out.write("   border-radius:7px;\r\n");
      out.write("}\r\n");
      out.write(".writeHere .i2{\r\n");
      out.write("   margin-top:14px;\r\n");
      out.write("   height:50%;\r\n");
      out.write("   width:100%;\r\n");
      out.write("   resize:none;\r\n");
      out.write("   border: 1px;\r\n");
      out.write("   border-radius:7px;\r\n");
      out.write("}\r\n");
      out.write(".writeHere .i4{\r\n");
      out.write("   width:60px;\r\n");
      out.write("   margin-left:90%;\r\n");
      out.write("   border:1px solid #F8F8F8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>   \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Nav/HomeNav.jsp", out, true);
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("   <div class=\"writeForm\">\r\n");
      out.write("      <div class=\"texts\">\r\n");
      out.write("         <p>ID\r\n");
      out.write("         <p class=\"i2\">content\r\n");
      out.write("         <p>Image\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"writeHere\">\r\n");
      out.write("         <p>&nbsp;");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("         <form name=\"writeForm\" method=\"post\" action=\"/sns/controller/uploadBoard\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <textarea class=\"i2\" name=\"content\" maxlength='500' placeholder=\"내용을 입력해 주세요\"></textarea>\r\n");
      out.write("            <input class=\"i3\" type=\"file\" name=\"ImageFile\" />\r\n");
      out.write("            <input class=\"i3\" type=\"file\" name=\"ImageFile\" />\r\n");
      out.write("            <input class=\"i3\" type=\"file\" name=\"ImageFile\" />\r\n");
      out.write("            <input class=\"i4\" type=\"submit\" value=\"등록\" />\r\n");
      out.write("         </form>\r\n");
      out.write("      </div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

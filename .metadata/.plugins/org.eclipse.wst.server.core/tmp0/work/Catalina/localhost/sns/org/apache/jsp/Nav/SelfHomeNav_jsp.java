/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2022-10-14 12:43:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Nav;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class SelfHomeNav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/user/Desktop/개발/자바/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/sns/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1665740099710L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../CssLink/CssLink.jsp", out, true);
      out.write("\n");
      out.write("\n");
      out.write("<!-- style here -->\n");
      out.write("<style>\n");
      out.write("	* { font-family: 'Spoqa Han Sans Neo', 'sans-serif'; }\n");
      out.write("#AcNav {\n");
      out.write("  width: 100%;\n");
      out.write("  position: relative;\n");
      out.write("  text-align: center;\n");
      out.write("  margin-top:15px;\n");
      out.write("  margin-bottom:100px;\n");
      out.write("}\n");
      out.write("#AcNav>a {\n");
      out.write("  display: block;\n");
      out.write("  font-size: 25px;\n");
      out.write("  font-weight: 900;\n");
      out.write("  position: absolute;\n");
      out.write("  left: 10%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#AcNav>form {\n");
      out.write("	display:inline-block;\n");
      out.write("	top:50%;\n");
      out.write("}\n");
      out.write("#AcNav>form>input{\n");
      out.write("	width:240px;\n");
      out.write("	height:35px;\n");
      out.write("	border:1px solid #BEC3C9;\n");
      out.write("	border-radius: 7px;\n");
      out.write("	background-color:#EFEFEF;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* width 가 1100이상일 때 */\n");
      out.write("@media(min-width :1000px){\n");
      out.write("	#AcNav>ul {\n");
      out.write("	  padding: 0 20px;\n");
      out.write("	  height: 30px;\n");
      out.write("	  color: #fff;\n");
      out.write("	  position: absolute;\n");
      out.write("	  transform: translateY(-20px);\n");
      out.write("	  right: 30px;\n");
      out.write("	  \n");
      out.write("	  display: inline-block;\n");
      out.write("	  list-style:none;\n");
      out.write("	  padding-left:0px;\n");
      out.write("	}\n");
      out.write("	#AcNav>ul li {\n");
      out.write("	  float: left;\n");
      out.write("	  line-height: 80px;\n");
      out.write("	  padding: 0 15px;\n");
      out.write("	}\n");
      out.write("	#AcNav .sideBar{\n");
      out.write("	display:none;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* width 가 1100이하로 내려가면 아이콘들 숨기게 하기 */\n");
      out.write("@media(max-width :1000px){\n");
      out.write("	#AcNav>ul>.n-sideBar{\n");
      out.write("		display:none;\n");
      out.write("	}\n");
      out.write("	#AcNav>ul>.sideBar {\n");
      out.write("	  padding: 0 20px;\n");
      out.write("	  height: 30px;\n");
      out.write("	  color: #fff;\n");
      out.write("	  position: absolute;\n");
      out.write("	  \n");
      out.write("	  right: 10%;\n");
      out.write("	  top:10px;\n");
      out.write("	  display: inline-block;\n");
      out.write("	  list-style:none;\n");
      out.write("	  padding-left:0px;\n");
      out.write("	}\n");
      out.write("	#AcNav>ul{\n");
      out.write("	margin-bottom:0px;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- html here -->\n");
      out.write("<nav id=\"AcNav\">\n");
      out.write("    <a href=\"/sns/controller/HomePage\">StarGram</a>\n");
      out.write(" \n");
      out.write("    <form method=\"post\" name=\"searchForm\" action=\"/sns/controller/getSearch\">\n");
      out.write("    	<input type=\"text\" name=\"searchText\" />\n");
      out.write("    </form>\n");
      out.write("    <ul >\n");
      out.write("<!--알림 -->\n");
      out.write("      <li class=\"n-sideBar\"><a href=\"/sns/controller/checkNoti\">\n");
      out.write("      	");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      </a></li>\n");
      out.write("<!--DM--> \n");
      out.write("      <li class=\"n-sideBar\"><a href=\"#\"><i class=\"fa-solid fa-paper-plane\"></i></a></li>\n");
      out.write("<!--글쓰기-->\n");
      out.write("      <li class=\"n-sideBar\"><a href=\"/sns/controller/WritePage\"><i class=\"fa-solid fa-pen\"></i></a></li>\n");
      out.write("<!-- 홈으로 가기 -->\n");
      out.write("      <li class=\"n-sideBar\"><a href=\"/sns/controller/HomePage\"><i class=\"fa-solid fa-house\"></i></a></li>\n");
      out.write("<!-- 계정설정 -->\n");
      out.write("      <li class=\"n-sideBar\"><a href=\"/sns/controller/SettingPage\"><i class=\"fa-solid fa-gear\"></i></a></li>\n");
      out.write("<!-- 로그아웃 -->\n");
      out.write("      <li class=\"n-sideBar\"><a href=\"#\" data-toggle=\"modal\" data-target=\"#logout\"><i class=\"fa-solid fa-arrow-right-from-bracket\"></i></a></li>\n");
      out.write("<!--햄버거-->  \n");
      out.write("      <li class=\"sideBar\">\n");
      out.write("      	<div class=\"dropdown\">\n");
      out.write("  			<a class=\"btn btn-primary dropdown-toggle\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("   			 	<i class=\"fa-solid fa-bars\"></i>\n");
      out.write("  			</a>\n");
      out.write("		  <div class=\"dropdown-menu\">\n");
      out.write("		    <a class=\"dropdown-item\" href=\"#\"><i class=\"fa-solid fa-paper-plane\"></i>DM</a>\n");
      out.write("		    <a class=\"dropdown-item\" href=\"/sns/controller/WritePage\"><i class=\"fa-solid fa-pen\"></i>Write</a>\n");
      out.write("		    <a class=\"dropdown-item\" href=\"/sns/controller/HomePage\"><i class=\"fa-solid fa-house\"></i>Home</a>\n");
      out.write("		    <a class=\"dropdown-item\" href=\"/sns/controller/SettingPage\"><i class=\"fa-solid fa-gear\"></i>Setting</a>\n");
      out.write("		    <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logout\"><i class=\"fa-solid fa-arrow-right-from-bracket\"></i>LogOut</a>\n");
      out.write("		  </div>\n");
      out.write("		</div>\n");
      out.write("		</li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("  </nav>\n");
      out.write("  \n");
      out.write(" <!-- 모달창 -->\n");
      out.write("	<div class=\"modal\" id=\"logout\">\n");
      out.write("		<div class=\"modal-dialog\">\n");
      out.write("			<div class=\"modal-content\">\n");
      out.write("\n");
      out.write("				<!-- Modal Header -->\n");
      out.write("				<div class=\"modal-header\">\n");
      out.write("					<h4 class=\"modal-title\">로그아웃</h4>\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("				<!-- Modal body -->\n");
      out.write("				<div class=\"modal-body\">\n");
      out.write("					<p>로그아웃 하시겠습니까?\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("				<!-- Modal footer -->\n");
      out.write("				<div class=\"modal-footer\">\n");
      out.write("					<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">취소</button>\n");
      out.write("					<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\"onclick=\"location.href='/sns/controller/Logout'\">로그아웃</button>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("			");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("			");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write('\n');
          out.write('	');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /Nav/SelfHomeNav.jsp(97,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notiCount > 0 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<i class=\"fa-solid fa-heart\"></i>");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /Nav/SelfHomeNav.jsp(98,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty notiCount || notiCount==0 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<i class=\"fa-regular fa-heart\"></i>");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }
}

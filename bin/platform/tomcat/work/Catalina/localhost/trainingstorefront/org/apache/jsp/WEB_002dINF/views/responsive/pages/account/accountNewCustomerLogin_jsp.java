/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2018-03-16 03:47:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.responsive.pages.account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accountNewCustomerLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(10);
    _jspx_dependants.put("/WEB-INF/tags/responsive/user/implicit.tld", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/user/register.tag", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/formElement/implicit.tld", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/formElement/formInputBox.tag", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/template/errorSpanField.tag", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/formElement/formSelectBox.tag", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/template/implicit.tld", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/tags/shared/theme/implicit.tld", Long.valueOf(1521108755000L));
    _jspx_dependants.put("/WEB-INF/common/tld/ycommercetags.tld", Long.valueOf(1521108754000L));
    _jspx_dependants.put("/WEB-INF/tags/responsive/formElement/formPasswordBox.tag", Long.valueOf(1521108755000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div class=\"register__section\">\n");
      out.write("\t");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_user_005fregister_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/responsive/pages/account/accountNewCustomerLogin.jsp(6,1) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/login/register");
      // /WEB-INF/views/responsive/pages/account/accountNewCustomerLogin.jsp(6,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("registerActionUrl");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_user_005fregister_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  user:register
    org.apache.jsp.tag.web.responsive.user.register_tag _jspx_th_user_005fregister_005f0 = new org.apache.jsp.tag.web.responsive.user.register_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_user_005fregister_005f0);
    try {
      _jspx_th_user_005fregister_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/views/responsive/pages/account/accountNewCustomerLogin.jsp(7,1) name = actionNameKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_user_005fregister_005f0.setActionNameKey("register.submit");
      // /WEB-INF/views/responsive/pages/account/accountNewCustomerLogin.jsp(7,1) name = action type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_user_005fregister_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${registerActionUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      _jspx_th_user_005fregister_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_user_005fregister_005f0);
    }
    return false;
  }
}

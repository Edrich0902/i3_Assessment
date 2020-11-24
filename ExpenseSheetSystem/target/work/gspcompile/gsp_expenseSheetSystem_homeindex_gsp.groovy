import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_expenseSheetSystem_homeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/home/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('textField','g',21,['name':("username")],-1)
printHtmlPart(6)
invokeTag('actionSubmit','g',23,['value':("Login"),'id':("loginBut")],-1)
printHtmlPart(7)
})
invokeTag('form','g',24,['id':("loginForm"),'name':("loginForm"),'url':([controller:'user', action:'login'])],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('textField','g',30,['name':("name")],-1)
printHtmlPart(10)
invokeTag('textField','g',32,['name':("surname")],-1)
printHtmlPart(11)
invokeTag('textField','g',34,['name':("balance")],-1)
printHtmlPart(5)
invokeTag('textField','g',36,['name':("username")],-1)
printHtmlPart(6)
invokeTag('actionSubmit','g',38,['value':("Register"),'id':("registerBut")],-1)
printHtmlPart(7)
})
invokeTag('form','g',39,['id':("registerForm"),'name':("registerForm"),'url':([controller:'user', action:'register'])],2)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',42,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1606247122072L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

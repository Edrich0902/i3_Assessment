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
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(4)
expressionOut.print(assetPath(src: 'favicon.ico'))
printHtmlPart(5)
expressionOut.print(assetPath(src: 'apple-touch-icon.png'))
printHtmlPart(6)
expressionOut.print(assetPath(src: 'apple-touch-icon-retina.png'))
printHtmlPart(7)
invokeTag('stylesheet','asset',12,['src':("application.css")],-1)
printHtmlPart(8)
invokeTag('javascript','asset',13,['src':("application.js")],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',14,[:],1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('textField','g',27,['name':("username")],-1)
printHtmlPart(12)
invokeTag('actionSubmit','g',29,['value':("Login"),'id':("loginBut")],-1)
printHtmlPart(13)
})
invokeTag('form','g',30,['id':("loginForm"),'name':("loginForm"),'url':([controller:'user', action:'login'])],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('textField','g',36,['name':("name")],-1)
printHtmlPart(16)
invokeTag('textField','g',38,['name':("surname")],-1)
printHtmlPart(17)
invokeTag('textField','g',40,['name':("balance")],-1)
printHtmlPart(11)
invokeTag('textField','g',42,['name':("username")],-1)
printHtmlPart(12)
invokeTag('actionSubmit','g',44,['value':("Register"),'id':("registerBut")],-1)
printHtmlPart(13)
})
invokeTag('form','g',45,['id':("registerForm"),'name':("registerForm"),'url':([controller:'user', action:'register'])],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',50,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1606251157121L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_expenseSheetSystem_transactioncreateNew_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transaction/createNew.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
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
invokeTag('textField','g',14,['name':("value")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',16,['name':("date")],-1)
printHtmlPart(7)
invokeTag('textField','g',18,['name':("description")],-1)
printHtmlPart(8)
invokeTag('field','g',20,['name':("user"),'readonly':("readonly"),'value':(user)],-1)
printHtmlPart(9)
invokeTag('actionSubmit','g',22,['value':("Create"),'id':("newTransactionSubmit")],-1)
printHtmlPart(1)
})
invokeTag('form','g',23,['id':("newTransactionForm"),'name':("newTransactionForm"),'url':([controller:'transaction', action:'newTransaction'])],2)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',24,[:],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1606308548734L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

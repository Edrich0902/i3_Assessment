<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta name='layout' content='main'/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Transaction</title>
    </head>
    <body>
        <h4 id="newTransactionTitle">Create new transaction</h4>
        
        <g:form id="newTransactionForm" name="newTransactionForm" url="[controller:'transaction', action:'newTransaction']">
            <label>Value</label>
            <g:field name="value" type="decimal"/>
            <label>Date</label>
            <span id="dateInput"><g:datePicker name="date"/></span>
            <label>Description</label>
            <g:textField name="description"/>
            <label>User</label>
            <g:field name="user" readonly="readonly" value="${user}"/>
                     
            <g:actionSubmit value="Create" action="newTransaction" id="newTransactionSubmit"/>
        </g:form>    
    </body>
</html>

<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta name='layout' content='main'/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transactions</title>
    </head>
    <body>
        <g:set var="service" bean="transactionService"/>
        <h4 id="recentTransactionsTitle">Transactions</h4>
        <!--Lists all the transactions for a user-->
        <div id="transactionsContainer">      
            <g:if test="${transactions}">
                <g:each in="${transactions}" status="i" var="transaction">
                    <div class="transaction">
                        <div id="details">
                            <span>ID: ${transaction.id}</span>
                            <span>${transaction.date}</span>
                        </div>
                        <span>${transaction.description}</span>

                        <span id="value">Amount: R${transaction.value}</span>
                        <span id="dollarValue">Dollar: $ ${service.convertCurrency(transaction.value)}</span>
                        <span id="runningBalance">Balance: R${transaction.runningBalance}</span>
                    </div>
                </g:each>
            </g:if>
            <g:else>
                <h4>No Transactions</h4>
            </g:else>
        </div>
        
        <g:link controller='transaction' action='createNew'>
            <input type="button" value="New Transaction" id="newTransactionBut"/>
        </g:link>
        
        <g:link controller='transaction' action='export'>
            <input type="button" value="Export" id="newTransactionBut"/>
        </g:link>
    </body>
</html>

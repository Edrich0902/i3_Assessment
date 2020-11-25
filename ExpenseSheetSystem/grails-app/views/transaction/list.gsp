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
                    </div>
                </g:each>
            </g:if>
            <g:else>
                <h4>No Transactions</h4>
            </g:else>
        </div>
    </body>
</html>

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta name="layout" content="main">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login/Register</title>
    </head>
    <body>
        <h1 id="welcomeTitle">Welcome to the Expense Sheet System</h1>
        
        <div id="container">
            <div class="tab">
                <input class="tablinks" type="submit" value="Login" onclick="setActiveTab(event), changeContent('login')"/>
                <input class="tablinks" type="submit" value="Register" onclick="setActiveTab(event), changeContent('register')"/>
            </div>
            
            <div id="login">
                <g:form id="loginForm" name="loginForm" url="[controller:'user', action:'login']">
                    <label>Username</label>
                    <g:textField name="username"/>
                    
                    <g:actionSubmit value="Login" id="loginBut"/>
                </g:form>
            </div>
            
            <div id="register">
                <g:form id="registerForm" name="registerForm" url="[controller:'user', action:'register']">
                    <label>Name</label>
                    <g:textField name="name"/>
                    <label>Surname</label>
                    <g:textField name="surname"/>
                    <label>Starting Balance</label>
                    <g:textField name="balance"/>
                    <label>Username</label>
                    <g:textField name="username"/>
                    
                    <g:actionSubmit value="Register" id="registerBut"/>
                </g:form>
            </div>
        </div>
    </body>
</html>

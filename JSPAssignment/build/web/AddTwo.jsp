<%-- 
    Document   : AddTwo
    Created on : Feb 11, 2020, 8:52:12 PM
    Author     : Sean Geraets
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="sumModel" class="edu.kirkwood.java.SumModel" 
             scope="session" />

<header>
    <h1>Name Form</h1>
</header>
<section>
    <h1>JSP and Servlet Assignment</h1>
    <p>Enter two numbers to add together.</p>
    <form action="SumHandler" method="GET">
        <label for="userNumber1">First Number</label>
        <input type="text" name="userNumber1" value="${sumModel.userNumber1}"/>
        <span class="errorSpan">${sumModel.userNumberError}</span>
        <br />
        <label for="userNumber2">Second Number</label>
        <input type="text" name="userNumber2" value="${sumModel.userNumber2}"/>
        <span class="errorSpan">${sumModel.userNumberError}</span>
        <br />
        <input type="submit" value="Submit"/>
        
        
    </form>
        <span class="additionSpan">Total: <%= sumModel.getUserNumber1() 
                + sumModel.getUserNumber2()%></span>
</section>





<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Demo</title>
</head>
<body>
    <h1>Welcome to JSP!</h1>
    
    <!-- JSP Expression -->
    <p>Current time: <%= new java.util.Date() %></p>
    
    <!-- JSP Scriptlet -->
    <% 
        String message = "Hello from JSP!";
        int count = 5;
    %>
    
    <p>Message: <%= message %></p>
    
    <!-- JSP Scriptlet with loop -->
    <ul>
    <% for(int i = 1; i <= count; i++) { %>
        <li>Item <%= i %></li>
    <% } %>
    </ul>
    
    <!-- JSP Declaration -->
    <%! 
        public String getGreeting() {
            return "Hello, World!";
        }
    %>
    
    <p>Greeting: <%= getGreeting() %></p>
</body>
</html> 
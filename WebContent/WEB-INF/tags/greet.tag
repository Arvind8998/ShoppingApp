<%@tag import="com.brainstuds.utils.LangReader"%>
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name ="user" type = "com.brainmentors.app.dto.UserDTO" required = "true" %>

<% if(user!=null){ %>

<h1 class = "page-header"><%=LangReader.getValue("welcomemsg") %>,

<%=LangReader.getValue("rolesmg")%><%=user.getRoleName() %> &nbsp;
 
 <%=session.getAttribute("uid") %></h1>
 
 <% }%>



